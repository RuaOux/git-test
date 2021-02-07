/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.Lambda05;

import java.util.ArrayList;

/*
    Lambda表达式： 是可推导，可省略
    凡是根据上下文推导出来的内容，都可以省略
    可以省略的内容：
        1. （参数列表）： 括号中参数列表的数据类型，可以省略不写
        2. （参数类表）： 括号中的参数如果只有一个，那么类型和（）都可以省略
        3. （一些代码）： 如果{}中的代码只有一行，无论是否有返回值，都可以省略({},return,分号)
            注意： 要省略({},return,分号)必须一起省略
 */
public class Demo01ArraysList {
    public static void main(String[] args) {
        // JDK 1.7版本之前，创建集合必须把前后的泛型都写上
        ArrayList<String> list01 = new ArrayList<String>();

        // JDK 1.8版本之后， =号后边的泛型可以省略,后边的泛型可以根据前边的泛型推导出来
        ArrayList<String> list02 = new ArrayList<>();
    }
}
