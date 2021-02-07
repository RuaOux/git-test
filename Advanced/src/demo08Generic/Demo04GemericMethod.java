/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo08Generic;

public class Demo04GemericMethod {
    public static void main(String[] args) {
        GenericMethod gc = new GenericMethod();

        /*
            调用含有泛型的方法method
            传递什么类型，泛型就是什么类型
         */
        gc.method01("name");
        gc.method01(100);
        gc.method01(100.0);
        gc.method01('中');

        gc.method02("mmm");   // 静态方法通过类名.方法名（参数）
        GenericMethod.method02("静态方法");

    }
}
