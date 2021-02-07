package com.RuaOux.Demo02.Lambda;
/*
    使用Lambda优化日志案例
    Lambda特点：延迟加载
    Lambda的使用前提：必须存在函数式接口
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        // 定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        // 调用showLog方法，参数是MessageBuilder是一个函数式接口，所以可以传递Lambda表达式
        showLog(1,() -> {
            // 返回一个拼接好的字符串
            System.out.println("不满足条件不执行");
            return msg1 + msg2 + msg3;
        });
        /*
            使用Lambda式作为参数传递，仅仅是把参数传递到showLog方法中
            只有满足条件，日志的等级是1级
                才会调用接口MessageBuilder中的方法
                才会进行字符串的拼接
            如果日志的等级不是1级
                那么MessageBuilder中的方法也不会执行
                所以拼接字符串的代码也不会执行
            不会存在性能浪费
         */
    }

    // 定义一个显示日志的方法，方法的参数传递日志的等级和MessageBuilder接口
    public static void showLog(int level , MessageBuilder mb){
        // 对日志的等级进行判断,如果是1级，则调用MessageBuilderMessage方法
        if (level == 1) {
            System.out.println(mb.builderMessage());
        }
    }
}
