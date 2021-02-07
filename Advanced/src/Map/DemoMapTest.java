/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    练习：
        计算一个字符串中的每一个字符的出现次数
    分析：
        1. 使用Scanner获取用户输入的字符串
        2. 创建Map集合，key是字符串中的字符，value是字符的个数
        3. 遍历字符串，获取每一个字符
        4. 使用获取到的字符去Map集合判断key是否存在。
            key存在：
                通过字符(key),获取value(字符个数)。
                value++;
                put(key,value)把新的value存储到Map集合中
            key不存在：
                put(key,1);
        5. 遍历Map集合，输出结果
 */
public class DemoMapTest {
    public static void main(String[] args) {
        // 1. 使用Scanner获取用户输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字母来判断字符串中每个字符的出现次数");
        String str = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0;i < str.length(); i++) {
            char st = str.charAt(i);
            // 4. 使用获取到的字符去Map集合判断key是否存在。
            //            key存在：
            //                通过字符(key),获取value(字符个数)。
            //                value++;
            //                put(key,value)把新的value存储到Map集合中
            //            key不存在：
            //                put(key,1);
            if (map.containsKey(st)) {
                //key存在：
                Integer integer = map.get(st);
                integer++;
                map.put(st,integer);
            } else {
                //key不存在：
                map.put(st,1);
            }
        }
        for (Character key : map.keySet()) {
            Integer integer = map.get(key);
            System.out.println(key + "=" +integer);
        }
    }
}
