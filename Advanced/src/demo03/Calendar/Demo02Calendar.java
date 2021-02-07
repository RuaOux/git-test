/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo03.Calendar;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }

    private static void demo04() {
        /*

         */
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }

    /*
           public abstract void add( int field, int amount): 根据日历的规则，为指定的日历字段添加或
           减去指定的时间量
            参数：
            int field: 传递指定的日历字段
            int amount: 增加/减少指定的值
                    正数： 增加；
                    负数： 减少
     */
    private static void demo03() {
        Calendar c = Calendar.getInstance();
        // 把年份增加2年
        c.add(Calendar.YEAR,2);
        // 把月份减少3个月
        c.add(Calendar.MONTH,-3);

        int year =  c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int date1 = c.get(Calendar.DAY_OF_MONTH);
        int date2 = c.get(Calendar.DATE);
        System.out.println(date2);
    }

    private static void demo02() {
       /* set（int field, int value）方法 将制定的日历字段设置为给定值。
            参数：
                int field:粗汉之制定的日历字段（YEAR,MONTH.....）
                int value:给制定字段设置的值                    */


        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR,2022);
        c.set(2024,8,03);

        int year =  c.get(Calendar.YEAR);
        System.out.println(year);  // 年份

        int month = c.get(Calendar.MONTH);
        System.out.println(month);  // 西方的月份是0-11
        // 所以这里是6月份  但是可以通过+1来调整为东方的月份

        int date1 = c.get(Calendar.DAY_OF_MONTH);
        int date2 = c.get(Calendar.DATE);
        System.out.println(date2);   // 28号  返回  这两个数值返回的都是当月的天
        System.out.println("====================");

    }

    // Calendar.getInstance(日期数值): 返回指定日历字段的值。
    private static void demo01() {
        // 使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year =  c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int date1 = c.get(Calendar.DAY_OF_MONTH);
        int date2 = c.get(Calendar.DATE);
        System.out.println(date2);
        System.out.println("=============");
    }
}
