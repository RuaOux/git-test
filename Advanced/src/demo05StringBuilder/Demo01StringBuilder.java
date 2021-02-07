/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo05StringBuilder;
/*
    java.lang.StringBuilder类：字符串缓冲区，可以提高字符串的效率
    构造方法：
        StringBuilder（） 构造一个不带任何字符的字符串生成器，其初始容量为16 个字节。
        StringBuilder( String str) 创建一个字符串，并初始化指定的字符串内容。

 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        // 空参数构造方法
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:" + bu1);  // bu1:""
        // 带字符串的构造方法
        StringBuilder bu2 = new StringBuilder("HelloWorld");
        System.out.println("bu2:" + bu2);  // bu2:"HelloWorld"
    }
}
