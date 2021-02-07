/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.RuaOux.Demo01;

public interface MyInterfaceDefaultB {
    public static void methodDefault1(){
        System.out.println("默认方法1");
        methodStaticCommon();
    }

    public static void methodDefault2(){
        System.out.println("默认方法2");
        methodStaticCommon();
    }

    private static void methodStaticCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
