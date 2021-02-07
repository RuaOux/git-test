/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo02_API;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() {
        // long getTime() 把日期转换成为毫秒值 注意 数值类型是long类型的
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    /*
*   Date类的带参数构造方法
*   Date(long date) : 专递毫秒值，把毫秒值转换为Date日期
* */
    private static void demo02() {
        Date date = new Date(0L);
        System.out.println(date);  // Thu Jan 01 08:00:00 CST 1970
    }

    /*
    Date类的空参数构造方法
    Date（）获取当前系统的日期和时间
     */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);  // Mon Jul 27 22:49:10 CST 2020
    }
}
