package com.RuaOux.Demo01.Stream;

import java.util.ArrayList;
import java.util.List;

/*
    使用Stream流的方式，遍历集合，对集合中的数据进行过滤
    Stream流是JDK1.8之后出现的
    关注的是做什么，而不是怎么做
 */

public class Demo02Stream {
    public static void main(String[] args) {
            // 创建一个list集合，存储姓名
            List<String> list = new ArrayList<>();
            list.add("张无忌");
            list.add("RuaOux");
            list.add("赵敏");
            list.add("张三");
            list.add("张三丰");

        // 对list集合中的元素进行过滤，只要以开头的元素，存储到一个新的集合中
        // 对list集合进行过滤，只要姓名长度为3的人，存储到一个新集合中
        // 遍历ListB集合
        list.stream().filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
    }
}
