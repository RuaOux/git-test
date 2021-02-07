package com.RuaOux.Demo06.Predicate.Demo01;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
    练习：集合信息筛选
    数组当中有多条”姓名+性别“的信息如下
    String[] arr = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男","赵丽颖,女"};
    请通过Predicate接口中的拼装将符合要求的字符串筛选到集合ArrayList中，
        需要同时满足俩个条件
            1.必须为女生。
            2.姓名为4个字。

    分析：
        1.有俩个判断条件，所以需要使用俩个Predicate接口,对条件进行判断
        2.必须同时满足俩个条件，所以可以使用and方法连接俩个判断条件
 */
public class Demo05Test {
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男","赵丽颖,女"};
        ArrayList<String> list = filter(arr, (String str) -> {
            // 获取字符串中的性别判断是否为女
            return str.split(",")[1].equals("女");
        }, (String str) -> {
            // 获取字符串中的性别,判断长度是否为4个字符串
            return str.split(",")[0].length() == 4;
        });
        for (String s : list) {
            System.out.println(s);
        }
    }

    /*
        定义一个方法
        方法的参数传递一个包含人员信息的数组
        传递俩个Predicate接口,用于对数组中的信息进行过滤
        把满足条件的信息存到ArrayList集中中并返回
     */
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1, Predicate<String> pre2){
        // 定义一个ArrayList集合存储过滤后的信息
        ArrayList<String> list = new ArrayList<>();
        // 遍历数组获得每一条信息
        for (String str : arr) {
            // 使用Predicate接口中的方法test对获取到的字符串进行判断
            boolean test = pre1.and(pre2).test(str);
            // 对得到的布尔值进行判断
            if (test) {
                // 条件成立，俩个条件都满足，把信息存储到ArrayList集合中
                list.add(str);
            }
        }
        return list;
    }
}
