/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Extends.Super;
/*
super 关键字的用法有三种。
1. 在子类的成员方法中。访问父类的成员变量。
2. 在子类的成员方法中。访问父类的成员方法。
3. 在子类的构造方法中。访问父类的构造方法。
 */
public class Zi extends Fu{
    int num = 20;
    public Zi() {
        super();
    }
    public void methodZi() {
        System.out.println(super.num);  // 调用父类的num
    }
    public void method() {
        super.method();
        System.out.println("子类方法");
    }
}
