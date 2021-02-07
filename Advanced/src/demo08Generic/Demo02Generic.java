/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo08Generic;

public class Demo02Generic {
    public static void main(String[] args) {
        // 不写泛型默认为Object类型
        Demo03Generic gc = new Demo03Generic();
        gc.setName("只能是字符串");

        Object obj = gc.getName();

        // 创建GenerictClass对象，泛型使用Integer类型
        Demo03Generic<Integer> gc2 = new Demo03Generic();
        gc2.setName(1);

        Integer name = gc2.getName();
        System.out.println(name);

        // 创建GenerictClass对象，泛型使用String类型
        Demo03Generic<String> gc3 = new Demo03Generic<>();
        gc3.setName("RuaOux");
        String name1 = gc3.getName();
        System.out.println(name1);
    }
}
