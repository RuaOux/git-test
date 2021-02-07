/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo08Generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        /*
            创建集合对象，使用泛型
            好处：
                1. 避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型。
                2. 把运行期异常（代码运行之后才会抛出的异常），提升了编译器（写代码的时候回报错）
            弊端：
                泛型是什么类型，只能存储什么类型的数据
         */

        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        //  list.add(1);  如果写其他数据类型的会直接报错

        // 使用迭代器遍历list集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str.length());
        }
    }

    /*
        创建集合对象，不适用泛型
        好处：
            集合不适用泛型，默认的类型就是Object类型，可以存储任意类型的数据
        弊端：
            不安全，会引发异常。
     */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        Iterator it = list.iterator();
        // 使用迭代器中的方法hasNext和next遍历集合
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);

            // 如果想要使用String特有的方法，obj则因为多态 Object obj = "abc";
            // 需要向下转型
            // 会抛出ClassCastException类型,不能把Integer类型转换成为String类型。
//            String s = (String)obj;
//            System.out.println(s.length());
        }
    }
}
