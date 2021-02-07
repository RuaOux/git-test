/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Extends.Constructor;
/*
继承关系中： 父子类构造方法的访问特点：

1. 子类构造方法当中有一个默认隐含的"super()"调用，所以一定是先调用的父类构造，后执行的子类构造
2. 可以通过super关键字来子类构造调用父类重载构造。
3. super的父类构造调用，必须是子类构造方法的第一个语句。 不能一个子类构造调用多次super构造。
4. 子类必须调用父类构造方法，不写则赠送super(); 写了则用写的指定super调用，super只能有一个，还必须是第一个
 */
public class Demo01Counstructor {
    public static void main(String[] args) {
        Zi zi = new Zi();

    }
}
