package com.ruaoux.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class ContextLoaderListener implements ServletContextListener {



    public void contextInitialized(ServletContextEvent sce) {
        // 读取web.xml的全局参数
        ServletContext servletContext = sce.getServletContext();
        String ccl = servletContext.getInitParameter("contextConfigLocation");

        ApplicationContext app = new ClassPathXmlApplicationContext(ccl);
        // 将Spring的应用上下文对象存储到ServletContext域中
        servletContext.setAttribute("app",app);
        System.out.println("spring容器创建完毕");
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
