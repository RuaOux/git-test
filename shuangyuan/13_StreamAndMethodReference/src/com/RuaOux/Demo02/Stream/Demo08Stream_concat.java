package com.RuaOux.Demo02.Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_concat:用于把流组合到一起
    如果有俩个流，希望合并成为一个流，那么可以使用Stream流中的静态方法concat
    static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)

 */
public class Demo08Stream_concat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵丽颖", "张无忌");
        String[] arr = {"羊1","羊2","羊3","狼1","狼2"};
        Stream<String> stream1 = Stream.of(arr);
        // 把以上俩个流组合为一个流
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(name-> System.out.println(name));

    }
}
