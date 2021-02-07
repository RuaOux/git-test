/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Extends.Constructor;

public class Zi extends Fu{
    public Zi() {
         super();  // 在调用父类无参构造方法
      //  super(20);  // 在调用父类重载的构造方法
        System.out.println("子类构造方法！");
    }
    public void method() {
      //  super();  // 错误写法！ 只有子类构造方法才能调用父类构造方法
    }
}
