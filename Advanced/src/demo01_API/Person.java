/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo01_API;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    /*
    直接打印对象的地址值没有意义，需要重写Object类中的toString方法
    打印对象的属性（name,age）;
     */

   /* @Override
    public String toString() {
        return "Person{name = " + name + ",age = " + age + "}";
    }*/

 /*   @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
*/

    /*@Override
    public boolean equals(Object obj) {
        // 增加一个判断，传递的参数obj如果是null，直接返回false
        // 使用向下转型，把obj转换为Person类型
        // 增加一个判断，防止类型转换异常 ClassCastException
        // 再增加一个判断，传递的参数obj如果是this本身，直接返回true
        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;
        }
        if (obj instanceof Person) {
            Person p = (Person)obj;
            boolean result = this.name.equals(p.name) && this.age == p.age;
            return result;
        }
        // 不是Preson类型直接返回false
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // 使用反射技术，判断o是否是Person类型  等效于  obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
