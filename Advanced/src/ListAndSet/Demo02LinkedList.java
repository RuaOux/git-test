/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ListAndSet;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List 接口
        LinkedList集合的特点：
            1. 底层是一个链表结构。  查询慢、增删快
            2. 里边包含了大量操作首尾元素的方法
            注意： 注意LinkedList集合特有的方法，不能使用多态

    public void getFirst();  获取集合中第一个元素
    public void getLast();  获取集合中最后一个元素
 */
public class Demo02LinkedList {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("W");
        linked.add("C");
        linked.add("b");

        String first =  linked.removeFirst();
        System.out.println(first);
        String lase = linked.removeLast();
        System.out.println(lase);
        System.out.println(linked);


    }

    private static void show01() {
        // 创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);  // [a, b, c]

        // public void addFirst (E e);   将指定元素插入此列表的开头。
        // public void push (E e)   此方法与addFirst方法相同
        linked.addFirst("www");
        System.out.println(linked);

        // public void addLast(E e); 将指定元素添加到此列表的结尾 此方法等效于add（）
        linked.addLast("bbb");
        System.out.println(linked);
    }
}
