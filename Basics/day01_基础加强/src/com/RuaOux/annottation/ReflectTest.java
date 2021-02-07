package com.RuaOux.annottation;

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
@Pro(className = "com.RuaOux.annottation.Demo1",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        // 可以创建任意类的对象，可以执行任意方法

           // 前提：不能改变该类的任何代码，可以创建任意类的对象，可以执行任意方法

        // 1. 解析注解
        // 1.1获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        // 2. 获取上边的注解对象

        Pro an = reflectTestClass.getAnnotation(Pro.class);
        // 其实就是在内存生成了一个该注解接口的子类实现对象
        /*
            public class ProImpl implements pro{
                public String className(){
                    return "com.RuaOux.annottation.Demo1";
                }
                pulibc String methodName(){
                    return "show";
                }
    }
 */
        // 3. 调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);

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
