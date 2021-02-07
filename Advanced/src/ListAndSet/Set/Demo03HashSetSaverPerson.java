/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ListAndSet.Set;

import java.util.HashSet;

/*
    HashSet 存储自定义类型元素

    set集合报错元素唯一：
        存储的 元素（String,Integet...Student,preson...),必须重写hashCode方法和equals方法

    要求：
        同名同年龄的人，视为同一个人，只能存储一次
 */
public class Demo03HashSetSaverPerson {
    public static void main(String[] args) {
        HashSet<Preson> set = new HashSet<>();
        Preson p1 = new Preson("人人人",18);
        Preson p2 = new Preson("人人人",18);
        Preson p3 = new Preson("人人人",19);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
