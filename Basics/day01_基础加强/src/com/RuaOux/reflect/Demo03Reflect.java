package com.RuaOux.reflect;

import com.RuaOux.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

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
public class Demo03Reflect {
    public static void main(String[] args) throws Exception {
        // 0. Person的Class对象
        Class<Person> pcls = Person.class;
        /*
		2. 获取构造方法们
			* Constructor<?> [ ] getconstructors()
			* Constructor<?> getconstructor(类<?> ... parameterTypes)

			* Construtor<?> getDeclaredConstructor(类<?> ... parameterTypes)
			* Construtor<?> [ ] getDeclaredConstrectors()
         */
        // Constructor<?> getconstructor(类<?> ... parameterTypes)
        Constructor<Person> constructor = pcls.getConstructor(String.class, int.class);
        System.out.println(constructor);
        // 创建对象
        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);

        System.out.println("==============");
        Constructor<Person> constructor1 = pcls.getConstructor();
        System.out.println(constructor1);
        // 创建对象
        Object person1 = constructor1.newInstance();
        System.out.println(person1);

        Object person2 = pcls.newInstance();
        System.out.println(person2);

        constructor1.setAccessible(true);
    }
}
