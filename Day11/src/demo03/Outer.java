/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo03;

  // 如果出现了重名现象,那么格式是： 外部类名称.this.外部类名称变量名;

public class Outer {
    int num = 10; // 外部类的成员变量
    public class Inner /* extends Objcet */{
        int num = 20; // 内部类的成员方法
        public void methodInner() {
            int num = 30;  //  内部类方法的局部变量
            System.out.println(num);  // 局部变量，就近原则
            System.out.println(this.num);  //  内部类的成员变量
            System.out.println(Outer.this.num);  // 外部类的成员变量
        }
    }
}
