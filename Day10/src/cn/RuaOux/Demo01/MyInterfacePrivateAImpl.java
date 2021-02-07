/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.RuaOux.Demo01;

public class MyInterfacePrivateAImpl implements MyInterfaceDefaultA{
    public void methodAnther(){
        // 直接访问打了接口中的默认方法，  这样是错误的。
//        methodCommon();
    }
}
