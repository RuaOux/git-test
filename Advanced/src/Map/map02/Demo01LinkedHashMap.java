/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Map.map02;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.linkedHashMap<K,V> entends HashMap<K,V>
    Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
    底层原理：
        哈希表+链表（记录元素的顺序）
        key 不允许重复，无序集合
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("d","d");
        map.put("e","e");
        map.put("c","c");

        System.out.println(map);
        System.out.println("=====================");
        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("b","b");
        linked.put("d","d");
        linked.put("e","e");
        linked.put("c","c");
        System.out.println(linked); // key 不允许重复  有序集合
    }
}

