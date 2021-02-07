/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package JDK9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
    JDK9的新特性：
        list接口，Set接口，Map接口：里边增加了一个静态的方法of，可以给集合一次性添加多个元素
        static <E> of (E... element)
        适用前提：
            当集合中存储的元素的个数已经确定了，不在改变时使用
    注意：
        1. of方法只适用于list接口,Set接口,Map,不适用于接口的实现类
        2. of方法的返回值是一个不能改变的集合，集合不能在使用add,put方法添加方法，会抛出异常
        3. Set接口和Map接口在调用of方法的时候，不能有重复的元素，否则会抛出异常

 */
public class Demo01JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a","b","c","d");
        System.out.println(list);
        // list.add("ccc");  // UnsupportedOperationException：不支持操作异常

        // Set<String> set = Set.of("a","b","c","c","s");
        //  System.out.println(set); // IllegalArgumentException:非法参数异常；有重复的元素
        Set<String> set = Set.of("a","b","c","s");
        System.out.println(set);

        Map<String, Integer> map = Map.of("张三", 18, "RuaOux", 24, "Brian", 20);
        System.out.println(map);
    }
}
