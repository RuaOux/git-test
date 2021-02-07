package com.RuaOux.Demo05.Consumer;

import java.util.function.Consumer;

public class Demo03Test {
    public static void main(String[] args) {
        // 定义一个字符串类型的数组
        String[] arr = {"RuaOux,男","XXXXX,女","哈哈哈哈,男"};
        // 调用printInfo方法，传递一个字符串数组，和两个Lambda表达式
        printInfo(arr,(message)->{
            // 消费方式:对message进行切割，获取姓名，按照指定的格式输出
            String name = message.split(",")[0];
            System.out.print("姓名:" + name);
        },(message)->{
            // 消费方式:对message进行切割，
            String sex = message.split(",")[1];
            System.out.println("性别:" + sex);

        });

    }

    // 定义一个方法 参数传递String类型的数组和两个Consumer接口,泛型使用String
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2){
        // 遍历字符数组
        for (String message : arr) {
            // 使用andThen方法连接俩个Consumer接口，消费字符串
            con1.andThen(con2).accept(message);
        }
    }
}
