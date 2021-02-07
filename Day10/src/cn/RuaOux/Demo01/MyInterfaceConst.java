/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.RuaOux.Demo01;
/*
接口当中也可以定义“成员变量”，但是必须使用public static final三个关键字进行修饰。
从效果上看，这其实就是接口的【常量】
格式：
public static final 数据类型 常量名称 = 数据值；
备注：
一但使用final关键字进行修饰，说明不可改变。

注意事项：
1. 接口当中的常量，可以省略public static final, 注意 不写也照样是这样的。
2. 接口当中的常量，必须进行赋值，不能不赋值。
3. 接口中常量的名称，使用完全大写的字幕，用下划线进行分割。（推荐命名规则）
 */
public interface MyInterfaceConst {

    // 这其实就是一个常量，一但赋值，是不可以修改
    public static final int NUM_OF_MY_CLASS = 10;

}
