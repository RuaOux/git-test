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

/*
java.text.DateFormat: 日期/事件格式化子类的抽象类
作用：
    格式化）（也就是日期 -> 文本） 、 解析（文本 -> 日期）
    成员方法：
        String format(Date date)  按照指定的模式，把Date日期，转换为符合模式的字符串
        Date parse(String source) 把符合模式的字符串，解析为Date日期
    DateFormat类是一个抽象类，无法直接创建对象使用，但是他有SimpeDateFormat作为实现类使用

    用给定的模式和默认语言环境的日期格式符号构造： SimpeDateFormat
    参数：
        String pattern:传递指定的模式
    模式： 区分大小写的
        y  年
        M  月
        d  日
        H  时
        m  分
        s  秒
 */
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    /*
    使用DateFormat类中的方法parse,把文本解析为日期
        使用步骤：
             1. 创建SimpeDateFormat对象，构造方法中传递指定的模式
             2. 调用SimpeDateFormat对象中的方法parse,把符合构造方法中模式的字符串，解析为Date日期
        注意事项：
            public Date parse(String source) throws ParseException
            parse方法声明了一个异常叫ParseException
            如果字符串和构造方法的模式不一样，那么程序就会抛出异常
            调用一个抛出了异常的方法，就必须处理这个异常，要么throws继续抛出这个异常，要么try catch自己处理
     */
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse("2088年08月08日 15时11分54秒");
        System.out.println(date);  // Sun Aug 08 15:11:54 CST 2088
    }

    /*
    使用DateFormat类中的方法format,把日期格式化为文本
        使用步骤：
            1. 创建SimpeDateFormat对象，构造方法中传递指定的模式
            2. 调用SimpeDateFormat对象中的方法format,按照构造方法中的指定的模式，
            把Date日期转换为符合模式的字符串（文本）
     */
    private static void demo01() {
        // 1. 创建SimpeDateFormat对象，在方法中专递指定的格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        // 2. 调用SimpeDateFormat对象中的方法格式
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);  // Tue Jul 28 20:28:50 CST 2020
        System.out.println(d);  // 2020年07月28日 20时28分50秒

    }
}
