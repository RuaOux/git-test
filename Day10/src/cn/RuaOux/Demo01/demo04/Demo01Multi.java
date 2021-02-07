/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.RuaOux.Demo01.demo04;
/*
代码当中体现多态性，其实就是一句话： 父类引用指向子类对象。
格式：
父类名称 对象名 = new 子类名称();
或者：
接口名称 对象名 = new 实现类名称();
 */
public class Demo01Multi {

    public static void main(String[] args) {
        // 使用多台的写法
        // 左侧父类的引用，指向了右侧子类的对象
        Fu zi = new Zi();
        zi.method();
        zi.methodFu();
    }
}
