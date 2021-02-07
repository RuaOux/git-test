/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo07Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    java.util.Iterator接口：迭代器（对集合进行遍历）
    有两个常用的方法：
        boolean hasNext():  如果仍有元素可以迭代，则返回true。
            判断集合中还有没有下一个元素，有就trur,没有就返回false。
        E next() 返回迭代的下一个元素。
            取出集合中的下一个元素
    Iterator迭代器是一个接口，我们无法直接使用，需要使用Iterator接口的实现类。获取实现类的方式比较特殊
    Collection接口中有一个方法，叫iterator(),这个方法返回的就是迭代器的实现类对象。
        Iterator<E> iterator() 返回在此 collction 的元素上进行迭代的迭代器。

    迭代器的使用步骤（重点）：
        1. 使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
        2. 使用Iterator接口中的方法hasNext判断还有没有下一个元素。
        3. 使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("艾佛森");

        //  获取一个迭代器
        // 多态 接口            实现类
        Iterator<String> it = coll.iterator();

        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }

        System.out.println("==============");

        for (Iterator<String> it2 = coll.iterator();it2.hasNext();) {
            String next = it2.next();
            System.out.println(next);
        }
    }

}
