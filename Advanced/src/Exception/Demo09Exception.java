/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Exception;
/*
    如果finally有return语句，永远返回finally中的结果，避免该情况。
 */
public class Demo09Exception {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a); // 100
    }

    // 定义一个方法，返回变量a的值
    public static int getA(){
        int a = 10;
        try {
            return a;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // 因为一定会执行的代码
            // 所以需要避免在finally中使用return语句
            a = 100;
            return a;
        }
    }
}
