package com.ruaoux.cofig;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

// 标记该类是Spring的核心配置类
@Configuration
// <context:component-scan base-package="com.ruaoux"/>
@ComponentScan("com.ruaoux")
@Import(DataSourceConfiguration.class)
public class SpringCofiguration {


}
