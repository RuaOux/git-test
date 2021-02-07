/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo05StringBuilder;
/*
    StringBuilder的常用方法
       public StringBuilder append(...): 添加任意数据类型的字符串形式，并返回当前对象自身
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu = new StringBuilder();
        // 使用append方法往StringBuilder中添加数据
        // append方法返回的是this，调用方法的对象bu,this == bu
//        StringBuilder bu2 = bu.append("abc"); // 把bu的地址复制给了bu2
//        System.out.println(bu); // abc
//        System.out.println(bu2); // abc
//        System.out.println(bu==bu2);  // 比较的是地址 true

//        使用append方法无需接受返回值
    /*    bu.append("abc");
        bu.append(1);
        bu.append(true);
        bu.append(5.5);
        bu.append('中');
        System.out.println(bu);  // abc1true5.5中*/

        /*
            链式编程：方法返回值是一个对象，可以继续调用方法
         */
        bu.append("abc").append(1).append(true).append(5.5).append('中');
        System.out.println(bu);  // abc1true5.5中
    }
}
