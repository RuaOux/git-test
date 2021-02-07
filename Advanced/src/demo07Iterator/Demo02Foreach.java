/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo07Iterator;

import java.util.ArrayList;
import java.util.List;

/*
    增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
    是 JDK 1.5 之后出现的新特性。
        Collction<E>extends Iterable<E>: 所有的单列集合都可以使用增强for
        public interface Iterable<T> 实现这个接口允许对象成为“foreach" 语句的目标

    增强for循环：用来遍历集合和数组
        for (集合/数组的数据类型 变量名: 集合名/数组名) {
            sout(变量名);
        }
 */
public class Demo02Foreach {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    public static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for(String s : list){
            System.out.println(s);
        }
    }

    private static void demo01() {
        int[] arr = {1,2,3,4};
        for(int  i : arr) {
            System.out.println(i);
        }
    }
}
