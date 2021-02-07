/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Extends.Field;

public class Zi extends Fu {
    int num = 20;
    public void method() {
    int num = 30;
        System.out.println(num);  // 30
        System.out.println(this.num);  // 20 本类的成员变量
        System.out.println(super.num); // 10 父类的成员变量
    }
}
