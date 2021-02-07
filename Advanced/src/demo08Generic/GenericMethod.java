/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo08Generic;
/*
    定义含有泛型的方法: 泛型定义在方法和修饰发和返回值类型这件

    格式：
        修饰符 <泛型> 返回值类型 方法名 （参数列表（使用泛型）） {
            方法体
        }

     含有泛型的方法，在调用方法的时候确定泛型的数据类型
     传递什么类型的参数，泛型就是什么类型。
 */
public class GenericMethod {
    // 定义一个含有泛型的方法
    public <M> void method01(M m) {
        System.out.println(m);
    }

    public static <M> void method02(M m) {
        System.out.println(m);
    }
}
