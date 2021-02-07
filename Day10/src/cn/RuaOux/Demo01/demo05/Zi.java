/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.RuaOux.Demo01.demo05;

public class Zi extends Fu{

    int num = 20;

    int age = 16;
    @Override
    public void showNum(){
        System.out.println(num);
    }
    public void method(){
        System.out.println("子类方法");
    }
    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
