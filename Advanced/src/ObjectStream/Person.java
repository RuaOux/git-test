/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ObjectStream;

import java.io.Serializable;

/*
    序列化和反序列化的时候，会抛出NotSerializableException没有序列化异常
    类通过实现 java.io.Serializable 接口以启用其序列化功能，未实现此接口的类将无法使其任何状态序列化或反序列化
    Serializable接口也叫标记型接口
        要进行序列化和反序列化的类必须要实现Serializable接口，就会给类添加一个标记
        当我们进行序列化和反序列化的时候，就会检测类上是否有这个标记
        有：就可以序列化和反序列化
        没有：就会抛出 NotSerializableException异常

 */
public class Person implements Serializable {
    private static final long serialVersionUID = 42L;
    private String name;
    // private transient int age;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
