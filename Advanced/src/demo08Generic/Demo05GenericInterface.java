/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo08Generic;

public class Demo05GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl gi1 = new GenericInterfaceImpl();
        gi1.method("字符串");

        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2<>();

        gi2.method(10);
        
    }
}
