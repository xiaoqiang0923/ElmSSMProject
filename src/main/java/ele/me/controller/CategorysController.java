package ele.me.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import ele.me.domain.Business;
import ele.me.domain.Categorys;
import ele.me.domain.CategorysCondition;
import ele.me.domain.CategorysExample;
import ele.me.service.CategorysService;
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
@RequestMapping("/categorys")
public class CategorysController {
    @Autowired
    private CategorysService categorysService;



    //  跳转用户管理页面
    @RequestMapping(value = "/categoryspage",method = {RequestMethod.GET})
    public String toLogin(){
        return "categorys";
    }

    @ResponseBody
    @RequestMapping(value = "listJSON")
    public MessageAndData listJSON(){
        List<Categorys> lists =categorysService.selectByExample(null);
        return MessageAndData.success("").add("lists",lists);

    }

    //  查询所有类别信息
    @ResponseBody
    @RequestMapping(value = "/list",method={RequestMethod.GET})
    public MessageAndData list(
            CategorysCondition categorysCondition,/*检索条件*/
            @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize
    )throws ParseException {
        System.out.println(categorysCondition);
        CategorysExample categorysExample = new CategorysExample();
        CategorysExample.Criteria criteria = categorysExample.createCriteria();

        String categorysName="";
        if(categorysCondition.getCgname()!=null && !categorysCondition.getCgname().equals("")){
            categorysName= "%"+categorysCondition.getCgname()+"%";
            criteria.andCgnameLike(categorysName);
        }
        Integer cgidC = categorysCondition.getCgidCondition();
        if(cgidC!=null && cgidC!=-1 && categorysCondition.getCgname()!=null){//不限定条件
            if(cgidC == 0){
                criteria.andCgidGreaterThan(categorysCondition.getCgid());
            }
            if(cgidC == 1){
                criteria.andCgidGreaterThan(categorysCondition.getCgid());
            }
            if(cgidC == 2){
                criteria.andCgidGreaterThan(categorysCondition.getCgid());
            }
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate1 = dateFormat.parse("1970-01-01");
        Date endDate1 = dateFormat.parse("2999-12-31");

        Date startDate = categorysCondition.getStartDate()==null?startDate1:categorysCondition.getStartDate();
        Date endDate = categorysCondition.getEndDate()==null?endDate1:categorysCondition.getEndDate();
        if(startDate.after(endDate)){
            Date tempDate = startDate;
            startDate = endDate;
            endDate = tempDate;
        }

        criteria.andAddTimeBetween(startDate,endDate);
        //初始化,约束
        PageHelper.startPage(pageNum, pageSize);
        List<Categorys> categorys = categorysService.selectByExample(categorysExample);
        //使用pageHelper的方式封装数据,默认的导航列表长度为8
        PageInfo pageInfo = new PageInfo(categorys, 8);
        return MessageAndData.success("").add("pageInfo",pageInfo);
    }
    @ResponseBody
    @RequestMapping(value = "/opt/{cgid}",method = RequestMethod.GET)
    public MessageAndData optSelectPrimaryKey(@PathVariable("cgid")Integer cgid){
        Categorys obj = categorysService.selectByPrimaryKey(cgid);
        return MessageAndData.success("查询成功").add("obj",obj);
    }


    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.POST)
    public MessageAndData optInsert(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request, Categorys obj) throws IOException {
         String path="c:\\upload";
        String filename = UUID.randomUUID() + "-" + file.getOriginalFilename();
        File file1 = new File(path, filename);
        if(!file1.exists()){
            file1.mkdirs();//迭代建立多级目录
        }
        file.transferTo(file1);
        String avatarUrl = "/upload/" + filename;
        obj.setCavatar(avatarUrl);
        System.out.println("obj###############################"+obj);
        Integer i = categorysService.insertSelective(obj);
        if(i>0){
            return MessageAndData.success("成功添加"+i+"条记录");
        }else{
            return MessageAndData.error("添加失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{cgid}",method = RequestMethod.DELETE)
    public MessageAndData deletes(@PathVariable("cgid")String cgid){
        //获取传递过来的uid列表,分解为一个集合对象
        List<Integer> iCgid = new ArrayList<Integer>();
        String splitSymbol = "\\D";
        String[] sCgid = cgid.split(splitSymbol);
        Integer i = null;
        for (String sCgids : sCgid) {
            iCgid.add(Integer.parseInt(sCgids));
        }
        if(iCgid.size() > 1) {//删除多条记录
            //创建一个UserExample对象
            CategorysExample categorysExample = new CategorysExample();
            categorysExample.createCriteria().andCgidIn(iCgid);
            //执行批量删除
            i = categorysService.deleteByExample(categorysExample);
        }else{//删除一条记录
            i = categorysService.deleteByPrimaryKey(iCgid.get(0));
        }
        return MessageAndData.success("删除成功"+i+"条记录").add("num", i);
    }


    //    如果使用put方法,记得要在web.xml中添加相应过滤器,对象不能封装
    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.PUT,headers="content-type=multipart/form-data")
    public MessageAndData optUpdate(@RequestParam(value = "file")MultipartFile file, HttpServletRequest request, Categorys obj) throws IOException{
        String path="c:\\upload";
        String filename = UUID.randomUUID() + "-" + file.getOriginalFilename();
        File file1 = new File(path, filename);
        if(!file1.exists()){
            file1.mkdirs();
        }
        file.transferTo(file1);
        String avatarUrl = "/upload/" + filename;
        obj.setCavatar(avatarUrl);

        int i = categorysService.updateByPrimaryKeySelective(obj);
        if(i>0){
            return MessageAndData.success("成功修改"+i+"条记录");
        }else{
            return MessageAndData.error("修改失败");
        }
    }




}