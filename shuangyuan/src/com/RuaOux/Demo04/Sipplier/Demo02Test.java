package com.RuaOux.Demo04.Sipplier;

import java.util.function.Supplier;

/*
    练习：
        求数组元素最大值
        使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值
        提示： 接口的泛型请使用java.lang.Integer类
 */
public class Demo02Test {
    // 定义一个方法
    public static int getMax(Supplier<Integer> sup){
        return  sup.get();
    }

    public static void main(String[] args) {
        // 定义一个int类型的数组,并赋值
        int[] arr = {100,0,-80,808,99,30,-50};
        int maxValue = getMax(() -> {
            // 获取数组的最大值并返回
            // 定义一个变量，把数组中的第一个元素赋值给该变量，记录数组中的元素最大值
            int max = arr[0];
            for (int i : arr) {
                // 使用其他的元素和最大值比较
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
}
