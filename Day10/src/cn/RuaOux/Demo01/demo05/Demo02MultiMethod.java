/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.RuaOux.Demo01.demo05;
/*
在多台的代码当中，成员方法的访问规则是：
    看new的是谁，就优先用谁，没有则向上找

口诀： 编译看左边，运行看右边。

对比一下：
成员变量：编译看左边，运行还看左边。
成员方法：编译看左边，运行看右边
 */
public class Demo02MultiMethod {

    public static void main(String[] args) {

        Fu obj = new Zi();  // 多台

        obj.method();  // 父子都有 优先用子
        obj.methodFu();

        // 编译看左，左边是Fu，Fu当中没有methodZi方法，所以编译报错
//        obj.methodZi(); // 错误写法！
    }
}
