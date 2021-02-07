/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package demo01_API;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        boolean result =  s1.equals(s2);
        System.out.println(result);

        boolean b2 = Objects.equals(s1,s2);
        System.out.println(b2);

    }
}
