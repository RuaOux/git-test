package com.RuaOux.Demo07.Function;

import java.util.function.Function;

/*
    Function接口中的默认方法andThen:用来进行组合操作

    需求：
        把String类型的"123",转换为Integer类型，把转换后的结果加10
        把增加之后的Integer类型的数据，转换为String类型

    分析：
        转换了俩次
        第一次是把String类型转换为了Integer类型
            所以可以使用Function<String,Integer> fun1
               Integer i = fun1.apply("123")+10;
        第二次是把Integer类型转换为String类型
            所以我们可以使用Function<Integer,String> fun2
                String s = fun2.apply(i)
        可以使用andThen把俩次转换组合在一起
            String s = fun1.andThen(fun2).apply("123");
            fun1先调用apply方法，把字符串转换为Integer类型
            fun2再调用apply方法，把Integer转换为字符串
 */
public class Demo02Function_andThen {
    public static void main(String[] args) {
        String s = "123";
        change(s,(String str)->{
            return Integer.parseInt(str) + 10;
        },(Integer i)->{
            return i + "";
        });
    }

    /*
        定义一个方法
        参数传递一个字符串类型的整数
        参数再传递俩个Function接口
            一个泛型使用Function<String,Integer>
            一个泛型使用Function<Integer,String>
     */

    public static void change(String s, Function<String,Integer> fun1, Function<Integer,String> fun2){
        String apply = fun1.andThen(fun2).apply(s);
        System.out.println(apply);
    }
}
