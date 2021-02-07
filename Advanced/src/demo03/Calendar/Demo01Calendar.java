/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo03.Calendar;

import java.util.Calendar;

/*
    java.util.Calendar类：日历类
    Calendar类是一个抽象类，里边提供了很多操作日历字段的方法(YEAR、MONTH、DAY_OF_MONTH、HOUR)
    Calendar类无法直接创建对象使用、里边有一个静态方法叫getInstance（）、该方法返回了Calendar类的子类对象
    static Calendar.getInstance() 使用默认时区和语言环境获得一个日历、
 */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}
