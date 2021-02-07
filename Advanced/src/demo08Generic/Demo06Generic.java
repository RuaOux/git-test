/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo08Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
    泛型的通配符：
        ？： 代表任意的数据类型
    使用方式：
        不能创建对象使用
        只能作为方法的参数使用
 */
public class Demo06Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);

        // ArrayList<?> list03 = new ArrayList<>();

    }
    /*
        定义一个方法，能遍历所有类型的Arraylist集合
        这时候我们需要ArrayList集合使用什么数据类型，可以泛型的通配符？来接收数据类型
        注意：
            泛型没有继承概念  所以在接收数据时不能写Object
     */
    public static void printArray(ArrayList<?> list) {
        // 使用迭代器遍历集合
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            // it.next()方法，取出的元素是Object，可以接受任意的数据类型
        }
    }
}
