package ele.me.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import ele.me.domain.*;
import ele.me.service.CustomerService;
import ele.me.service.OrderlistService;
import ele.me.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/orderlist")
public class OrderlistController {
    @Autowired
    private ele.me.service.OrderlistService orderlistService;

//  跳转用户管理页面
    @RequestMapping(value = "/orderlistpage",method = {RequestMethod.GET})
    public String toLogin(){
        return "orderlist";
    }


//  查询所有管理者信息
    @ResponseBody
    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    public MessageAndData list(
            OrderlistCondition condition,/*检索条件*/
            @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize

    ) throws ParseException {
        OrderlistExample example = new OrderlistExample();
        OrderlistExample.Criteria criteria = example.createCriteria();

        if(condition.getOid()!=null){
            criteria.andOidEqualTo(condition.getOid());
        }

        Integer pstatus = condition.getPaysstatus();
        if(pstatus!=null && pstatus!=-1 && condition.getPaysstatus()!=null){//不限定条件
            if(pstatus == 0){
                criteria.andPaysstatusEqualTo(condition.getPaysstatus());
            }
            if(pstatus == 1){
                criteria.andPaysstatusEqualTo(condition.getPaysstatus());
            }

        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate1 = dateFormat.parse("1970-01-01");
        Date endDate1 = dateFormat.parse("2999-12-31");
        Date startDate = condition.getStartDate()==null?startDate1:condition.getStartDate();
        Date endDate = condition.getEndDate()==null?endDate1:condition.getEndDate();
        if(startDate.after(endDate)){
            Date tempDate = startDate;
            startDate = endDate;
            endDate = tempDate;
        }
        criteria.andAddTimeBetween(startDate,endDate);
        //初始化,约束
        PageHelper.startPage(pageNum, pageSize);
        List<Orderlist> lists = orderlistService.selectByExampleWithObject(example);
        //使用pageHelper的方式封装数据,默认的导航列表长度为8
        PageInfo pageInfo = new PageInfo(lists, 8);
        return MessageAndData.success("").add("pageInfo",pageInfo);
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{id}",method = RequestMethod.GET)
    public MessageAndData optSelectPrimaryKey(@PathVariable("id")Integer id){
        Orderlist obj = orderlistService.selectByPrimaryKeyWithObject(id);
        return MessageAndData.success("查询成功").add("obj",obj);
    }

//添加新数据
    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.POST)
    public MessageAndData optInsert(Orderlist obj){

        Integer i = orderlistService.insertSelective(obj);
        if(i>0){
            return MessageAndData.success("成功添加"+i+"条记录");
        }else{
            return MessageAndData.error("添加失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{ids}",method = RequestMethod.DELETE)
    public MessageAndData deletes(@PathVariable("ids")String ids){
        //获取传递过来的id列表,分解为一个集合对象
        List<Integer> iIds = new ArrayList<Integer>();
        String splitSymbol = "\\D";
        String[] sIds = ids.split(splitSymbol);
        Integer i = null;
        for (String sIid : sIds) {
            iIds.add(Integer.parseInt(sIid));
        }
        if(iIds.size() > 1) {//删除多条记录
            //创建一个UserExample对象
            OrderlistExample example = new OrderlistExample();
            example.createCriteria().andOidIn(iIds);
            //执行批量删除
            i = orderlistService.deleteByExample(example);
        }else{//删除一条记录
            i = orderlistService.deleteByPrimaryKey(iIds.get(0));
        }
        return MessageAndData.success("删除成功"+i+"条记录").add("num", i);
    }

    //    如果使用put方法,记得要在web.xml中添加相应过滤器,对象不能封装
    @ResponseBody
    @RequestMapping(value = "/optu",method = RequestMethod.PUT)
    public MessageAndData optUpdate(Orderlist obj){
        int i = orderlistService.updateByPrimaryKeySelective(obj);
        if(i>0){
            return MessageAndData.success("成功修改"+i+"条记录");
        }else{
            return MessageAndData.error("修改失败");
        }
    }
}
