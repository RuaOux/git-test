/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Recursion;
/*
    练习：
        使用递归计算1-n之间的和
 */

public class Demo02Recursion {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1 );
    }
}
