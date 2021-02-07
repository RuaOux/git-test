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
    Map集合的第一种遍历方式： 通过键找值的方式
    Map集合中的方法：
        Set<K> keySet() 返回此映射中包含的键的Set返回。
    实现步骤：
        1. 使用Map集合中的方法keySet().把Map集合所有的key取出来，存储到一个Set集合中
        2. 遍历set集合，获取Map集合中的每一个Key
        3. 通过Map集合中的方法get(key), 通过key找到value
 */
public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("RuaOux",170);
        map.put("Brian",165);

       // 1. 使用Map集合中的方法keySet().把Map集合所有的key取出来，存储到一个Set集合中
        Set<String> set = map.keySet();
        System.out.println(set);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + value);
        }
        System.out.println("====================");

        // 使用增强for遍历Set集合
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
