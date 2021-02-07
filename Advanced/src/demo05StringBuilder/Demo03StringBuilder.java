/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo05StringBuilder;
/*
    StringBuilder和String可以相互转换：
        String -> StringBuilder;  可以使用StringBilder的构造方法
            StringBuilder(String trs) 构造一个字符串，并初始化指定的字符串内容。

    StringBuilder -> String: 可以使用StringBuilder中的toString方法。
        public String toString(): 将当前StringBuilder对象转换为String对象
        StringBuilder bu = new StringBuilder("HelloWorld");
        String str1 = bu.toString();  // 返回一个String HelloWorld
 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);
        StringBuilder bu = new StringBuilder(str);
        // 往StringBuilder中添加数据
        bu.append("World");
        System.out.println(bu);
        String str1 = bu.toString();
        System.out.println(str1);
    }
}
