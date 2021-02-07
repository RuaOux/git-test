/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo02_API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    练习：
        使用日期时间相关的API，计算出一个人已经出生了多少天
    分析：
        1. 使用Scanner类的方法next.获取日期
        2. 使用Dateformat类中的方法parse，把字符串的出生日期，解析为Date格式的出生日期
        3. 把Date格式的出生日期转换为毫秒值
        4. 获取当前的日期，转换为毫秒值。
        5. 使用当前日期的毫秒值减去出生日期的毫秒值
        6. 把毫秒差值转换为天
 */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        // 使用Scanner类来输入出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期");
        String birthdayDateString = sc.next();
        // 使用DateFormat类中的方法parse.把字符串的出生日期转换为Date格式的出生日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);
        // 将Date格式的出生日期转换为毫秒值
        long birthdayDateTime = birthdayDate.getTime();
        // 获取当前日期的 转换为毫秒
        long todayTime = new Date().getTime();

        long time = todayTime - birthdayDateTime;

        System.out.println(time/1000/60/60/24 + "天");
    }
}
