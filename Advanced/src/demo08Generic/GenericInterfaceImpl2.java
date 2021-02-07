/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo08Generic;
/*
        含有泛型的接口第二种使用方式：接口使用什么泛型，实现类就使用什么泛型，类跟着接口走
        就相当于定义了一个含有泛型的类，创建对象的时候确定泛型的类型
        public interface List<E> {

            }
 */
public class GenericInterfaceImpl2<I> implements GenericInterface<I>{
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
