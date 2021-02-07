/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Extends.This;
/*
super 关键字用来访问父类内容，而this管家在你用来访问本类内容。用法也有三种：
1. 在本类的成员方法中，访问本类的成员变量。
2. 在本来的成员方法中，访问本类的另一个成员方法。
3. 在本类的构造方法中，访问本类的另一个构造方法
在第三种用法当中要注意，
A.this(...)调用也必须是构造方法的第一个语句。唯一一个
B.super和this两种构造调用，不能同时使用
 */
public class Zi extends Fu{
    int num = 20;
    public Zi() {
        //  super();  这一行不再赠送
        this(123);  // 本来的无参构造，调用本类的有参构造
       // this(123,33);  // 错误写法
    }
    public Zi(int n) {

    }
    public Zi(int n,int b) {

    }
    public void showNum(){
        int num = 10;
        System.out.println(num);  // 局部变量
        System.out.println(this.num);  // 本类当中的成员变量
        System.out.println(super.num);  // 父类中的成员变量
    }
    public void methodA() {
        System.out.println("AAA");
    }
    public void methodB() {
        this.methodA();
        System.out.println("BBB");
    }
}
