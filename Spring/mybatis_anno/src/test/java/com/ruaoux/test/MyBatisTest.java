package com.ruaoux.test;

import com.ruaoux.domain.Order;
import com.ruaoux.domain.User;
import com.ruaoux.mapper.OrderMapper;
import com.ruaoux.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    private UserMapper mapper;

    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    /*@Test
    public void testSave(){
        User user = new User();
        user.setName("Brian");
        user.setPassword("123456");
        mapper.save(user);
    }*/


    /*@Test
    public void testFindAllOreder(){
        List<Order> orderList = mapper.findAll();
        for (Order order : orderList) {
            System.out.println(order);
        }
    }*/

    @Test
    public void test3(){
        List<User> userList = mapper.findUserAndOrederAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void test4(){
        List<User> userList = mapper.findUserAndRoleAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
