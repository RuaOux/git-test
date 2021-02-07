package com.RuaOux.reflect;

import com.RuaOux.domain.Person;
import com.RuaOux.domain.Student;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    假设：写一个"框架",不能改变该类的任何代码的前提下，可以帮我们创建任意类的西爱过你，并且执行其中任意方法
        实现：
            1. 配置文件
            2. 反射
        步骤：
            1. 将需要创建的对象的全类名和需要执行的方法定义在配置文件中
            2. 在程序中去加载读取配置文件
            3. 使用反射技术来加载类文件进内存
            4. 创建对象
            5. 执行
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        // 可以创建任意类的对象，可以执行任意方法

           // 前提：不能改变该类的任何代码，可以创建任意类的对象，可以执行任意方法
        // 1. 加载配置文件
        // 1.1 创建Properties对象
        Properties pro = new Properties();
        // 1.2 加载配置文件,转换为一个集合
        // 1.2.1 获取class目录下的配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        // 2. 获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        // 3. 加载该类进内存
        Class cls = Class.forName(className);
        // 4. 创建对象
        Object obj = cls.newInstance();
        // 5. 获取对象
        Method method = cls.getMethod(methodName);
        // 6. 执行方法
        method.invoke(obj);


    }
}
