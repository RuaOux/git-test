/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo04System;

import java.lang.reflect.Array;
import java.util.Arrays;

/*

 */
public class Demo01System {
    public static void main(String[] args) {
        demo02();
    }

    /*
        public static void arraycopy(Object src, int srcPos, Object dest, int destPas, int length)
        将数组中指定的数据拷贝到另一个数组中:
            参数：
                src    - 要被拷贝的数组
                srcPos - 被拷贝数组的起始索引号。
                dest   - 拷贝进去的目标数组
                destPos- 目标数组中的起始索引号。
                length - 要赋值的数组元素数量。
            练习：
            将src数组中的前3个元素,赋值到dest数组的前3个位置上
                   复制元素前：
            src数组[1,2,3,4,5], dest数组元素[6,7,8,9,10]
                   复制元素后：
            src数组[1,2,3,4,5,],dest数组元素[1,2,3,9,10]
     */
    private static void demo02() {
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }

    /*
        public static long currentTimerMillis();  返回以毫秒值为单位的当前时间。
     */
    private static void demo01() {
        // 程序执行前，获取一次毫秒值
        long start = System.currentTimeMillis();
        for (int i = 1; 1 <= 9999; i++) {
            System.out.println(i);
        }

    }
}
