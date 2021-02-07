/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Recursion;
/*
    递归：方法自己调用自己
        - 递归的分类：
            - 递归分为两种，直接递归和间接递归。
            - 直接递归称为方法自己调用自己。
            - 间接递归可以A方法调用B方法；B方法调用C方法，C方法调用A方法。
        - 注意事项：
            递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。
            在递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出
            构造方法，禁止递归
     递归的适用前提:
        当调用方法的时候，方法的主体不变，每次调用方法的参数不同，可以使用递归
 */
public class Demo01Recursion {
    public static void main(String[] args) {
        // a();
        b(1);
    }

    private static void b(int i) {
        System.out.println(i);
        if (i == 10000) {
            return;
        }
        b(++i);
    }

    private static void a() {
        System.out.println("a方法");
        a();
    }

}
