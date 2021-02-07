package com.RuaOux.reflect;

import com.RuaOux.domain.Person;

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
public class Demo02Reflect {
    public static void main(String[] args) throws Exception {
        // 0. Person的Class对象
        Class<Person> pcls = Person.class;
        /*
            1. 获取成员变量们
			* Field[ ] getFields()
			* Field[ ] getFields(String name)

			* Field[ ] getDeclaredFields()
			* Field getDeclaredField(String name)
         */
        // 1. * Field[ ] getFields()
        Field[] fields = pcls.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("--------------------");
        Field a = pcls.getField("a");
        // 获取成员变量a的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        // 设置a的值
        a.set(p,"张三");
        System.out.println(p);

        System.out.println("================");
        // * Field[ ] getDeclaredFields()：获取所有的成员变量,不考虑修饰符
        Field[] declaredFields = pcls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        // * Field getDeclaredField(String name)
        Field d = pcls.getDeclaredField("d");
        // 访问之前忽略访问权限修饰符的安全检查
        d.setAccessible(true);   // 暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);
    }
}
