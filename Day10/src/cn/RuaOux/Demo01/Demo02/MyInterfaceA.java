/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.RuaOux.Demo01.Demo02;

public interface MyInterfaceA {
    // 错误写法！ 接口不能有静态代码块
//    static {}
    // 错误写法！ 接口不能有构造方法
//    public MyInterface(){}
    public abstract void methodA();
    public abstract void methodAbs();
    public default void methodDefault(){
        System.out.println("默认方法AAA");
    }
}
