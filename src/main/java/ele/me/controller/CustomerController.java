package ele.me.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import ele.me.domain.*;
import ele.me.service.CustomerService;
import ele.me.utils.MD5Util;
import ele.me.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @ResponseBody
    @RequestMapping(value = "/listJSON")
    public MessageAndData listJSON(){
        List<Customer> lists = customerService.selectByExample(null);
        return MessageAndData.success("").add("lists",lists);
    }

//  跳转用户管理页面
    @RequestMapping(value = "/customerpage",method = {RequestMethod.GET})
    public String toLogin(){
        return "customer";
    }



//  查询所有管理者信息
    @ResponseBody
    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    public MessageAndData list(
            CustomerCondition customerCondition,/*检索条件*/
            @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize

    ) throws ParseException {
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();

        String userName="";
        if(customerCondition.getCname()!=null && !customerCondition.getCname().equals("")){
            userName = "%"+customerCondition.getCname()+"%";
            criteria.andCnameLike(userName);
        }

        Integer cidC = customerCondition.getCidCondition();
        if(cidC!=null && cidC!=-1 && customerCondition.getCid()!=null){//不限定条件
            if(cidC == 0){
                criteria.andCidGreaterThan(customerCondition.getCid());
            }
            if(cidC == 1){
                criteria.andCidEqualTo(customerCondition.getCid());
            }
            if(cidC == 2){
                criteria.andCidLessThan(customerCondition.getCid());
            }
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate1 = dateFormat.parse("1970-01-01");
        Date endDate1 = dateFormat.parse("2999-12-31");
        Date startDate = customerCondition.getStartDate()==null?startDate1:customerCondition.getStartDate();
        Date endDate = customerCondition.getEndDate()==null?endDate1:customerCondition.getEndDate();
        if(startDate.after(endDate)){
            Date tempDate = startDate;
            startDate = endDate;
            endDate = tempDate;
        }
        criteria.andAddTimeBetween(startDate,endDate);
        //初始化,约束
        PageHelper.startPage(pageNum, pageSize);
        List<Customer> customers = customerService.selectByExample(customerExample);
        //使用pageHelper的方式封装数据,默认的导航列表长度为8
        PageInfo pageInfo = new PageInfo(customers, 8);
        return MessageAndData.success("").add("pageInfo",pageInfo);
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{cid}",method = RequestMethod.GET)
    public MessageAndData optSelectPrimaryKey(@PathVariable("cid")Integer cid){
        Customer obj = customerService.selectByPrimaryKey(cid);
        return MessageAndData.success("查询成功").add("obj",obj);
    }

//添加新数据
    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.POST)
    public MessageAndData optInsert(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request,Customer obj) throws IOException {
        String path="c:\\upload";
//        String path = request.getSession().getServletContext().getRealPath("/images/upload");
        String filename = UUID.randomUUID() + "-" + file.getOriginalFilename();
        File file1 = new File(path, filename);
        if(!file1.exists()){
            file1.mkdirs();
        }
        file.transferTo(file1);
        String avatarUrl = "/upload/" + filename;
        obj.setCavatar(avatarUrl);

        Integer i = customerService.insertSelective(obj);
        if(i>0){
            return MessageAndData.success("成功添加"+i+"条记录");
        }else{
            return MessageAndData.error("添加失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{cids}",method = RequestMethod.DELETE)
    public MessageAndData deletes(@PathVariable("cids")String cids){
        //获取传递过来的uid列表,分解为一个集合对象
        List<Integer> iCids = new ArrayList<Integer>();
        String splitSymbol = "\\D";
        String[] sCids = cids.split(splitSymbol);
        Integer i = null;
        for (String sUid : sCids) {
            iCids.add(Integer.parseInt(sUid));
        }
        if(iCids.size() > 1) {//删除多条记录
            //创建一个UserExample对象
            CustomerExample customerExample = new CustomerExample();
            customerExample.createCriteria().andCidIn(iCids);
            //执行批量删除
            i = customerService.deleteByExample(customerExample);
        }else{//删除一条记录
            i = customerService.deleteByPrimaryKey(iCids.get(0));
        }
        return MessageAndData.success("删除成功"+i+"条记录").add("num", i);
    }


    //    如果使用put方法,记得要在web.xml中添加相应过滤器,对象不能封装
    @ResponseBody
    @RequestMapping(value = "/optu",method = RequestMethod.POST)
    public MessageAndData optUpdate(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request, Customer obj) throws IOException {
        String path="c:\\upload";
//        String path = request.getSession().getServletContext().getRealPath("/images/upload");
        String filename = UUID.randomUUID() + "-" + file.getOriginalFilename();
        File file1 = new File(path, filename);
        if(!file1.exists()){
            file1.mkdirs();
        }
        file.transferTo(file1);
        String avatarUrl = "/upload/" + filename;
        obj.setCavatar(avatarUrl);

        int i = customerService.updateByPrimaryKeySelective(obj);
        if(i>0){
            return MessageAndData.success("成功修改"+i+"条记录");
        }else{
            return MessageAndData.error("修改失败");
        }
    }
}
