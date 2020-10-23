package ele.me.test;


import ele.me.domain.Adminuser;
import ele.me.service.AdminuserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {
    @Test
    public void test01() {
        //拿到容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取bean
        AdminuserService adminuserService = context.getBean("adminuserService", AdminuserService.class);
        //调用方法
        Adminuser adminuser = adminuserService.selectByPrimaryKey(1);
        System.out.println(adminuser);
    }
}
