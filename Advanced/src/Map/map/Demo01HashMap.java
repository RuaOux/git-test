/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Map.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的：
        作为key的元素，必须重写hashCode和equals方法，以保证唯一。
 */
public class Demo01HashMap {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("RuaOux",18),"广州");
        map.put(new Person("Brian",19),"上海");
        map.put(new Person("X1",20),"北京");
        map.put(new Person("RuaOux",24),"上海");
        // 使用ertrySet和增强for遍历Map集合
      //  System.out.println(map.entrySet());
        Set<Map.Entry<Person,String>> set = map.entrySet();
        for (Map.Entry<Person,String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "->" + value);
        }
    }

    private static void show01() {
        HashMap<String,Person> map = new HashMap<>();
        map.put("广州",new Person("RuaOux",18));
        map.put("上海",new Person("张三",20));
        map.put("广西",new Person("X1改",19));
        map.put("广州",new Person("00Q",24));

        Set<String> set = map.keySet();
        for (String key : set) {
            Person Value = map.get(key);
            System.out.println(key+"->"+Value);
        }
    }
}
