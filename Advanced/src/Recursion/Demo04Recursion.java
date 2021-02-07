/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Recursion;

import java.io.File;

public class Demo04Recursion {
    public static void main(String[] args) {
        File f1 = new File("F:\\game");
        getAllFile(f1);
    }
    /*
        定义一个方法参数传递File类型的目录
        方法中对目录进行遍历
     */
    public static void getAllFile(File dir) {
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getAllFile(f);
            }
        }
    }
}
