package com.RuaOux.Demo07.Function;

import java.util.function.Function;

/*
    使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
        String str = "赵丽颖,20";
    1.将字符串截取数组年龄部分，得到字符串
    2.将上一步的字符串转换为int类型的数字
    3.将上一步的int数字累加100,得到int数字
 */
public class Demo03Test {
    public static void main(String[] args) {
        String str = "赵丽颖,20";
        int num = getNum(str, s -> s.split(",")[1]
                , s -> Integer.parseInt(s), i -> i + 100);
        System.out.println(num);
    }

    public static int getNum(String str, Function<String,String> fun1,
    Function<String,Integer> fun2,Function<Integer,Integer> fun3){
       // 使用andThen方法把三个转换组合打一起
        return fun1.andThen(fun2).andThen(fun3).apply(str);
    }
}
