package com.RuaOux.reflect;

import com.RuaOux.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
    	*:class对象功能：
	    *获取功能：
		1. 获取成员变量们
			* Field[ ] getFields()  获取所有public修饰的成员变量
			* Field[ ] getFields(String name)

			* Field[ ] getDeclaredFields()
			* Field getDeclaredField(String name)
		2. 获取构造方法们
			* Constructor<?> [ ] getconstructors()
			* Constructor<?> getconstructor(类<?> ... parameterTypes)

			* Construtor<?> getDeclaredConstructor(类<?> ... parameterTypes)
			* Construtor<?> [ ] getDeclaredConstrectors()
		3. 获取成员方法们
			* Method[ ] getMethod()
			* Method getMethod(String name, 类<?> ... parameterTypes)

			* Method[ ] getDeclaredMethod()
			* Method getDeclaredMethod(String name, 类<?> ... parameterTypes)
		4. 获取类名
			* String getName()
 */
public class Demo04Reflect {
    public static void main(String[] args) throws Exception {
        // 0. Person的Class对象
        Class<Person> personClass = Person.class;
        /*
		2. 获取构造方法们
			* Method[ ] getMethod()
			* Method getMethod(String name, 类<?> ... parameterTypes)

			* Method[ ] getDeclaredMethod()
			* Method getDeclaredMethod(String name, 类<?> ... parameterTypes)
         */
        // 获取指定名称的方法
        Method eat_menthod = personClass.getMethod("eat");
        Person p = new Person();
        // 执行方法
        eat_menthod.invoke(p);

        Method eat_method2 = personClass.getMethod("eat", String.class);
        // 执行方法
        eat_method2.invoke(p,"饭");

        System.out.println("-----------------");
        // 获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }

        // 获取类名
        String className = personClass.getName();
        System.out.println(className);
    }
}
