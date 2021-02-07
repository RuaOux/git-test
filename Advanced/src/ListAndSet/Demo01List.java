/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ListAndSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);

        // public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上
        //在c和d之间添加一个itheima
        list.add(3,"itheima");
        System.out.println(list);  // [a, b, c, itheima, d, a]

        // public E remove (int index); 移除列表中指定位置的元素，返回的是被移除的元素
        // 移除元素
        String removeE = list.remove(2);
        System.out.println(list);
        System.out.println(removeE);

        // public E set(int index, E element): 用指定元素替换集合中指定位置的元素，返回值是更新前的元素
        String setE = list.set(4,"A");
        System.out.println(setE);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("================");
        Iterator<String> it =  list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("===================");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
