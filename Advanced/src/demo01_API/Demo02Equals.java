/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo01_API;

import java.util.ArrayList;

public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("迪丽热巴",18);
        Person p2 = new Person("迪丽热巴",18);

        boolean result = p1.equals(p2);
        System.out.println(result);

        boolean result1 = p1.equals(p1);
        System.out.println(result1);

    }
}
