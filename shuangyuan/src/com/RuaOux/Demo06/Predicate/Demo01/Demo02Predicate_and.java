package com.RuaOux.Demo06.Predicate.Demo01;

import java.util.function.Predicate;

/*
    逻辑表达式：可以连接多个判断的条件
    需求：判断一个字符串，有两个判断条件
        1. 判断字符串的长度是否大于5
        2. 判断字符串中是否包含a
    两个条件必须同时满足，我们就可以使用&&运算符连接两个条件

    Predicate接口中有一个方法and，他表示并且关系，也可以用于两个判断条件
    default Predicate<T> and(Predicate<? super T> other) {
        Objects.requireNonNull(Other)
        return (t) -> this.test(t) && other.test(t);
    }
    方法内部的俩个判断条件，也是使用&&运算符连接起来的
 */
public class Demo02Predicate_and {
    /*
        定义一个方法，方法的参数，传递一个字符串
        传递两个Predicate接口
            一个用于判断字符串的长度是否大于5
            一个用于判断字符串中是否包含a
            两个条件必须同时满足
     */
    public static void main(String[] args) {
        String arr = "bbcdef";
        boolean b = checkString(arr, (String str) -> {
            // 判断字符串长度是否超过5
            return str.length()>5;
        }, (String str) -> {
            // 判断字符串中是否包含a
            return str.contains("a");
        });
        System.out.println(b);
    }

    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
       // return pre1.test(s) && pre2.test(s);
        return pre1.and(pre2).test(s); //等价于return pre1.test(s) && pre2.test(s);
    }
}
