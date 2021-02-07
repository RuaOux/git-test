package com.RuaOux.Demo02.Stream;

import java.util.stream.Stream;

/*
     Stream流中的常用方法_skip:用于跳过元素
     如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流；
     Stream<T> skip(long n);
        如果流的当前长度大于n,则跳过前n哥，否则将得到一个长度为0的空流。
 */
public class Demo07_skip {
    public static void main(String[] args) {
        // 获取一个Stream流
        String[] arr = {"羊1","羊2","羊3","狼1","狼2"};
        Stream<String> stream = Stream.of(arr);
        // 使用skip方法跳过前三个元素
        Stream<String> skip = stream.skip(3);
        skip.forEach(name-> System.out.println(name));
    }
}
