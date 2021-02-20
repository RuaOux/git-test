package com.ruaoux.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruaoux.domain.User;
import com.ruaoux.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisTest {

    @Test
    public void test3() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 设置分页的相关参数  当前页+每页显示的条数
        PageHelper.startPage(2,2);
        List<User> userList = mapper.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
        // 获得与分页相关的参数
        PageInfo<User> pageInfo = new PageInfo<User>(userList);
        System.out.println("当前页:" + pageInfo.getPageNum() );
        System.out.println("每页显示:" + pageInfo.getPageSize() );
        System.out.println("总条数:" + pageInfo.getTotal() );
        System.out.println("总页数:" + pageInfo.getPages() );
        System.out.println("上一页:" + pageInfo.getPrePage());
        System.out.println("下一页:" + pageInfo.getNextPage());
        System.out.println("是否是第一页:" + pageInfo.isIsFirstPage());
        System.out.println("是否是最后一页:" + pageInfo.isIsLastPage());





    }


    @Test
    public void test2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 模拟数据用户数据
        User user = mapper.findById(10);
        System.out.println("user中的birthday:" + user.getBirthday());

    }

    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 模拟数据用户数据
        User user = new User();
        user.setName("dan");
        user.setPassword("123456");
        user.setBirthday(new Date());
        mapper.save(user);
        sqlSession.commit();
    }
}
