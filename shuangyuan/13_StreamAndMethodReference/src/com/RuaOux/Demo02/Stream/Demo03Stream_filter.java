package com.RuaOux.Demo02.Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_filter:用于Stream流中的数据进行过滤
    Stream<T> filter(Perdicate<? super T> predicate);
    filter方法的参数Predicate是一个函数式接口，所以可以传递Lambda表达式，对数据进行过滤
    Predicate中的抽象方法：
        boolean test (T t)
 */
public class Demo03Stream_filter {
    public static void main(String[] args) {
        // 创建一个Stream流
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵丽颖", "张无忌");
        // 对Stream流中的元素进行过滤,只要姓张的人
        Stream<String> stream1 = stream.filter(name -> name.startsWith("张"));
        stream1.forEach(name-> System.out.println(name));

        /*
            stream流属于管道留，只能被消费一次(使用)一次
            而这时第一个Stream流已经使用完毕，就会关闭了
            所以第一个Stream流就不能再调用方法了
         */
        stream.forEach(name-> System.out.println(name));
    }
}
