/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合遍历的第二种方式：  使用Entry对象遍历
    Map集合中的方法：
        Set<Map.Entery<K,V> entrySet() 返回此映射中包含的映射关系的 Set 视图。

    实现步骤：
        1. 使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来。存储到一个Set集合中
        2. 遍历Set集合，获取每一个Entry对象
        3. 使用Entry对象中的方法getkey()和getValue()获取键与值
 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("RuaOux",200);
        map.put("Brian",150);
        map.put("233333",185);

        //  1. 使用Map集合中的方法entrySet(),把
        //  Map集合中多个Entry对象取出来。存储到一个Set集合中
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        //    2. 遍历Set集合，获取每一个Entry对象
        Iterator<Map.Entry<String,Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "+" + value);
        }
        System.out.println("=================");
        for (Map.Entry<String,Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "+" + value);
        }
    }
}
