package ele.me.test;

import ele.me.domain.*;
import ele.me.service.AdminuserService;
import ele.me.service.OrderlistService;
import ele.me.utils.MD5Util;
import ele.me.service.CategorysService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)     //使用spring的容器作为平台运行junit
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})   //通过配置文件获取context容器
public class SpringWithJunitTest {
    @Autowired     //自动注入
    private AdminuserService adminuserService;
    @Autowired
    private CategorysService categorysService;
    @Autowired
    private OrderlistService orderlistService;


    @Test
    public void test01() {
        Adminuser adminuser = adminuserService.selectByPrimaryKey(2);
        System.out.println(adminuser);
    }

    @Test
    public void test02() {
        Categorys categorys = categorysService.selectByPrimaryKey(3);
        System.out.println(categorys);
    }

    @Test
    public void test03() {
        Adminuser adminuser = new Adminuser();
        AdminuserExample adminuserExample = new AdminuserExample();
        AdminuserExample.Criteria criteria = adminuserExample.createCriteria();
        adminuser.setPassword(MD5Util.getMD5(adminuser.getPassword()));
        adminuser = adminuserService.selectByPrimaryKey(2);
        System.out.println(adminuser);
    }

    @Test
    public void test05() {
        Orderlist orderlist = new Orderlist();
        OrderlistExample orderlistExample = new OrderlistExample();
        OrderlistExample.Criteria criteria = orderlistExample.createCriteria();
        List<Orderlist> list = orderlistService.selectByExampleWithObject(null);
        for(Orderlist item:list){
            System.out.println(item);
        }

    }
}
