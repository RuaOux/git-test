package com.ruaoux.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.util.ResourceBundle;

public class DataSourceTest {
    @Test
    // 测试Spring容器产生数据源对象
    public void test4() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource ds = (DataSource) app.getBean("dataSource");
        Connection con = ds.getConnection();
        System.out.println(con);
    }

    @Test
    // 测试手动创建 c3p0数据源（加载properties配置文件）
    public void test3() throws Exception {



    }


    @Test
    // 测试手动创建 druid 数据源
    public void test2() throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db4");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        DruidPooledConnection con = dataSource.getConnection();
        System.out.println(con);
        con.close();
    }

    @Test
    // 测试手动创建 c3p0 数据源
    public void test1() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/db4");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        Connection con = dataSource.getConnection();

    }

}
