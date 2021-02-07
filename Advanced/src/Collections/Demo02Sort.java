/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
/*
    public static <T> void sort (List<T> list); 将集合中元素按照默认规则排序

    注意： sort(list<T> list) 使用前提
        被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则

    Comparable接口的排序规则：
        自己(this) - 参数； 升序
        参数 - 自己(this);  降序
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01,1,2,3,4,56,6);

        System.out.println(list01);
        // public static <T> void sort (List<T> list); 将集合中元素按照默认规则排序
        Collections.sort(list01);   // 默认是升序

        System.out.println(list01);
        ArrayList<String> list02 = new ArrayList<>();
        Collections.addAll(list02,"a","c","b");
        System.out.println(list02);
        Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("张三",18));
        list03.add(new Person("法外狂徒",24));
        list03.add(new Person("狗蛋",15));
        System.out.println(list03);  //[Person{name='张三', age=18}, Person{name='法外狂徒', age=24}, Person{name='狗蛋', age=15}]

        Collections.sort(list03);
        System.out.println(list03);
    }
}
