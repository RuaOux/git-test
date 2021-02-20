package com.ruaoux.demo;

import com.ruaoux.service.UserService;
import com.ruaoux.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) app.getBean("userService");
        service.save();

    }
}
