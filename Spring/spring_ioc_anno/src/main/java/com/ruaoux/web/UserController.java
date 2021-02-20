package com.ruaoux.web;

import com.ruaoux.cofig.DataSourceConfiguration;
import com.ruaoux.cofig.SpringCofiguration;
import com.ruaoux.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
       // ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringCofiguration.class);
        UserService service = app.getBean(UserService.class);
        service.save();

    }
}
