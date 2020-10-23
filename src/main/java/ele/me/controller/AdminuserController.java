package ele.me.controller;

import ele.me.domain.Adminuser;
import ele.me.domain.AdminuserExample;
import ele.me.service.AdminuserService;
import ele.me.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/adminuser")
public class AdminuserController {
    @Autowired
    private AdminuserService adminuserService;

//    跳转登录页面
    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public String toLogin(){
        return "pages/login";
    }

//    密码验证
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
}
