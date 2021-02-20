package com.ruaoux.service.impl;

import com.ruaoux.dao.UserDao;
import com.ruaoux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/*<bean id="userService" class="com.ruaoux.service.impl.UserServiceImpl">

</bean>*/


@Scope("prototype")
//@Scope("singleton")
@Service("userService")
public class UserServiceImpl implements UserService {
     // <property name="userDao" ref="userDao"></property>
    //@Autowired  // 按照数据类型从Spring容器中进行匹配的
    //@Qualifier("userDao") // 按照id值从容器中进行匹配，但是注意此处@Qualifier要结合@Autowired一起用
    @Resource(name = "userDao") // 相当于
    private UserDao userDao;
    @Value("${jdbc.driver}")
    private String driver;

    public void save() {
        System.out.println(driver);
        userDao.save();
    }
    @PostConstruct
    public void init(){
        System.out.println("Service对象的初始化方法");
    }
    @PreDestroy
    public void destory(){
        System.out.println("Service对象的销毁方法");
    }
}
