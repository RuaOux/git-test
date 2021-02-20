package com.ruaoux.demo;

import com.ruaoux.dao.UserDao;
import com.ruaoux.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserDaoDemo {
    public static void main(String[] args) {
      //  ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\Spring\\spring_ioc\\src\\main\\resources\\applicationContext.xml");
        // UserDao userDao = (UserDao) app.getBean("userDao");
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
