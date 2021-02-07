/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo03;

public class Demo02InnerClass {
    public static void main(String[] args) {
        // 外部类名称.内部类名称 对象名 = new 外部类名称（）. new 内部类名称（）;
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
    }
}
