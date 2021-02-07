/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Map.map02;

import java.util.HashMap;
import java.util.Hashtable;

/*
    java.util.Hashtable<K,V> 集合 implements Map<K,V>接口

     Hashtable：底层也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
     HashMap：底层是一个哈希表，是一个线程不安全的集合，多线程的集合，速度快

     HashMap集合：可以存储null值，null键
     Hashtable集合：不能存储null值，null键

     Hashtable和Vector集合一样，在JDK1.2版本之后被更先进的集合（HashMap,ArrayList）取代了
     Hashtable的子类Properties依然在使用
     Properties集合是一个唯一和IO刘相结合的集合
 */
public class Demo02Hashtable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);  // {null=null, b=null}

        System.out.println("===============");
        Hashtable<String,String> table = new Hashtable<>();
        // table.put(null,"a");
    }
}
