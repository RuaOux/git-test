/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ListAndSet.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点：
        底层是一个哈希表（数组+链表/红黑树) + 链表;多了一条链表（记录元素的存储顺序）,保证元素有序
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");

        set.add("abc");
        set.add("abc");
        set.add("RuaOux");
        System.out.println(set);   // [abc, www, RuaOux] 无序，不允许重复

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");

        linked.add("abc");
        linked.add("abc");
        linked.add("RuaOux");
        System.out.println(linked);   // [www, abc, RuaOux] 有序，不允许重复
    }
}
