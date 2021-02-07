/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Recursion;
/*
    练习递归计算阶乘
        n的阶乘：n! = n * (n-1) *...* 3 * 2 * 1
 */
public class Demo03Recursion {
    public static void main(String[] args) {
        System.out.println(jc(5));
    }
    /*
        定义方法使用递归计算阶乘
        递归结束的条件
            获取到1的时候结束
        递归的目的
            获取下一个被乘的数字（n-1)
        方法的参数会发生变化
     */
    public static int jc (int n) {
        if (n == 1) {
            return 1;
        }
        return n * jc(n-1);
    }
}

