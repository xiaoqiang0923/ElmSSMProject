package ele.me.test;

import ele.me.dao.AdminuserMapper;
import ele.me.dao.CustomerMapper;
import ele.me.domain.Adminuser;
import ele.me.domain.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/10/13 0013
 * @描述
 */
public class MyBatisTest {
    InputStream resourceAsStream = null;
    SqlSessionFactory sqlSessionFactory = null;
    SqlSession sqlSession = null;

    @Before
    public void init() throws IOException {
        //1 加载配置文件
        resourceAsStream = Resources.getResourceAsStream("mybatisForTest.xml");
        //2 获取SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3 获取sqlSession
        sqlSession = sqlSessionFactory.openSession(true);
    }

    public void destroy() throws IOException {
        //6 关闭资源
//        sqlSession.commit();
        sqlSession.close();
        resourceAsStream.close();
    }


    @Test
    public void test01(){
        AdminuserMapper adminuserMapper = sqlSession.getMapper(AdminuserMapper.class);
        Adminuser adminuser = adminuserMapper.selectByPrimaryKey(1);
        System.out.println(adminuser);
    }

    @Test
    public void test02(){
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        List<Customer> customers = customerMapper.selectByExample(null);
        for (Customer customer:customers
             ) {
            System.out.println(customer);
        }
    }
}
