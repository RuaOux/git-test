/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Extends;
/*
在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式

直接通过子类对象访问成员变量：
    等号左边是谁，就优先用谁，没有则向上找
间接通过成员方法访问成员变量：
    该方法属于谁：就优先用谁，没有则向上找
 */
public class Demo02ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();  // 创建父类对象
        System.out.println(fu.numFu);  // 只能使用父类的东西, 没有任何子类内容

        Zi zi = new Zi();
        System.out.println(zi.numFu); // 10
        System.out.println(zi.numZi); // 20
        System.out.println("=====================");

        System.out.println(zi.num);  // 200  优先子类
//        System.out.println(zi.abc);  // 到处都没有，编译报错！
        zi.methodZi();  // 200
        // 这个方法是在父类当中定义的  所以父类方法运用的是父类的变量
        zi.methodFu();  // 100
    }
}
