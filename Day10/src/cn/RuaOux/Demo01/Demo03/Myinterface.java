/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.RuaOux.Demo01.Demo03;
/*
这个子接口当中有几个方法？  答： 4个
methodA 来源接口A
methodB 来源接口B
methodCommon 同时来源于接口A和B
method 来源于我自己

注意事项：
1. 多个父接口当中的抽象方法如果重复，没关系。
2. 多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写，【而且带着default关键字】
 */
public interface Myinterface extends MyInterfaceA,MyInterfaceB{

    public abstract void method();

    @Override
    default void methodDefuatl() {

    }
}
