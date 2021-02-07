/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo08Generic;

/*
    定义一个含有泛型的类，模拟Arraylist集合
    泛型是一个未知的数据类型，当我们不确定什么数据类型的时候，可以使用泛型
    泛型可以接受任意的数据类型，可以使用Integer,String,Student....
    创建对象的时候确定泛型的数据类型
 */
public class Demo03Generic<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
