package com.ruaoux.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

public class JdbcTest {

    // 测试Spring产生JdbcTemplate对象
    @Test
    public void test2() throws PropertyVetoException {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate template = app.getBean(JdbcTemplate.class);
        String sql = "insert into account values('lisi',4000)";
        int count = template.update(sql);
        System.out.println(count);

    }

    // 测试JdbcTemplate开发步骤
    @Test
    public void test1() throws PropertyVetoException {
        // 创建数据源对象

        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setDriverClass("com.mysql.jdbc.Driver");
        ds.setJdbcUrl("jdbc:mysql:///test");
        ds.setUser("root");
        ds.setPassword("root");

        JdbcTemplate template = new JdbcTemplate();
        // 设置数据源对象   知道数据库在哪
        template.setDataSource(ds);
        // 执行操作
        String sql = "insert into account values(?,?)";
        int count = template.update(sql, "tom", 5000);
        System.out.println(count);
    }
}
