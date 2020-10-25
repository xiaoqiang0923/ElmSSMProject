package ele.me.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import ele.me.domain.Adminuser;
import ele.me.domain.AdminuserCondition;
import ele.me.domain.AdminuserExample;
import ele.me.service.AdminuserService;
import ele.me.utils.MD5Util;
import ele.me.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/adminuser")
public class AdminuserController {
    @Autowired
    private AdminuserService adminuserService;

//  跳转登录页面
    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public String toLogin(){
        return "pages/login";
    }

//  退出登录
    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request){
//            将用户基本信息从session中清除
        HttpSession session = request.getSession();
        session.setAttribute("USER_SESSION","");//单独设置session
//            session.invalidate();//使所有的session失效
        return "redirect:/index.jsp";
    }

//  密码验证
    @RequestMapping(value = "/loginCheck")
    public String loginCheck(Adminuser adminuser, HttpServletRequest request){
        AdminuserExample adminuserExample = new AdminuserExample();
        AdminuserExample.Criteria criteria = adminuserExample.createCriteria();
        adminuser.setPassword(MD5Util.getMD5(adminuser.getPassword()));
        criteria.andUsernameEqualTo(adminuser.getUsername()).andPasswordEqualTo(adminuser.getPassword());
        List<Adminuser> byUser = adminuserService.selectByExample(adminuserExample);
        if(byUser.size()>0){
//            将用户基本信息记录在session中
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(3600);//会话时间3600秒
            session.setAttribute("USER_SESSION",byUser.get(0).getUsername());
            return "admin";
        }else{
            return "pages/login";
        }
    }

//  查询所有管理者信息
    @ResponseBody
    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    public MessageAndData list(
            AdminuserCondition adminuserCondition,/*检索条件*/
            @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize

    ) throws ParseException {
        System.out.println(adminuserCondition);
        AdminuserExample adminuserExample = new AdminuserExample();
        AdminuserExample.Criteria criteria = adminuserExample.createCriteria();

        String userName="";
        if(adminuserCondition.getUsername()!=null && !adminuserCondition.getUsername().equals("")){
            userName = "%"+adminuserCondition.getUsername()+"%";
            criteria.andUsernameLike(userName);
        }

        Integer uidC = adminuserCondition.getUidCondition();
        if(uidC!=null && uidC!=-1 && adminuserCondition.getUid()!=null){//不限定条件
            if(uidC == 0){
                criteria.andUidGreaterThan(adminuserCondition.getUid());
            }
            if(uidC == 1){
                criteria.andUidEqualTo(adminuserCondition.getUid());
            }
            if(uidC == 2){
                criteria.andUidLessThan(adminuserCondition.getUid());
            }
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate1 = dateFormat.parse("1970-01-01");
        Date endDate1 = dateFormat.parse("2999-12-31");
        Date startDate = adminuserCondition.getStartDate()==null?startDate1:adminuserCondition.getStartDate();
        Date endDate = adminuserCondition.getEndDate()==null?endDate1:adminuserCondition.getEndDate();
        if(startDate.after(endDate)){
            Date tempDate = startDate;
            startDate = endDate;
            endDate = tempDate;
        }
        criteria.andAddTimeBetween(startDate,endDate);
        //初始化,约束
        PageHelper.startPage(pageNum, pageSize);
        List<Adminuser> adminusers = adminuserService.selectByExample(adminuserExample);
        //使用pageHelper的方式封装数据,默认的导航列表长度为8
        PageInfo pageInfo = new PageInfo(adminusers, 8);
        return MessageAndData.success("").add("pageInfo",pageInfo);
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{uid}",method = RequestMethod.GET)
    public MessageAndData optSelectPrimaryKey(@PathVariable("uid")Integer uid){
        Adminuser adminuser = adminuserService.selectByPrimaryKey(uid);
        return MessageAndData.success("查询成功").add("adminuser",adminuser);
    }


    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.POST)
    public MessageAndData optInsert(Adminuser adminuser){
        Integer i = adminuserService.insertSelective(adminuser);
        if(i>0){
            return MessageAndData.success("成功添加"+i+"条记录");
        }else{
            return MessageAndData.error("添加失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{uids}",method = RequestMethod.DELETE)
    public MessageAndData deletes(@PathVariable("uids")String uids){
        //获取传递过来的uid列表,分解为一个集合对象
        List<Integer> iUids = new ArrayList<Integer>();
        String[] sUids = uids.split("-");
        Integer i = null;
        for (String sUid : sUids) {
            iUids.add(Integer.parseInt(sUid));
        }
        if(iUids.size() > 1) {//删除多条记录
            //创建一个UserExample对象
            AdminuserExample userExample = new AdminuserExample();
            userExample.createCriteria().andUidIn(iUids);
            //执行批量删除
            i = adminuserService.deleteByExample(userExample);
        }else{//删除一条记录
            i = adminuserService.deleteByPrimaryKey(iUids.get(0));
        }
        return MessageAndData.success("删除成功"+i+"条记录").add("num", i);
    }


    //    如果使用put方法,记得要在web.xml中添加相应过滤器,对象不能封装
    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.PUT)
    public MessageAndData optUpdate(Adminuser adminuser){
        System.out.println(adminuser);
        int i = adminuserService.updateByPrimaryKeySelective(adminuser);
        if(i>0){
            return MessageAndData.success("成功修改"+i+"条记录");
        }else{
            return MessageAndData.error("修改失败");
        }
    }
}
