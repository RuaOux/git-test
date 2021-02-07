/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo01_API;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
    java.lang.Object
    类 Object 是类层次结构的跟（父）类。
    每个类(Person.Student...)都是用 Object 作为超（父）类。
    所有对象（包含数组）都实现这个类的方法。
 */
public class Demo01ToString {
    public static void main(String[] args) {
       // Person 类继承了Object类，所以可以使用Object类中的toString方法
        // String toString()  返回该对象的字符串表示。
        Person p = new Person("张三",18);
        String s = p.toString();
        System.out.println(s);  // 直接打印对象的名字，其实就是调用对象的toString 地址值
        // 但是可以通过重写toString方法来打印出对象中的属性name和age

        // 看一个类是否重写了toString,直接打印这个类的对象即可。
        // 如果没有重写toString方法那么打印的是对象的地址值

        Random r = new Random();
        System.out.println(r);  // 地址值

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println();
    }
}
