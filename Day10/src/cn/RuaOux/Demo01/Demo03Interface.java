/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.RuaOux.Demo01;
/*
注意:不能通过接口实现类的对象来调用接口当中的静态方法。
正确用法： 通过接口名称，直接调用其中的静态方法。
格式：
接口名称.静态方法名
 */
public class Demo03Interface {
    public static void main(String[] args) {
        // 创建了实现类对象
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
        // 错误写法!
        //  impl.methodStatic();
        // 直接通过接口名称调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}
