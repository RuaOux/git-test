/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package File;

import java.io.File;

/*
    File类遍历（文件夹）目录功能
        - public String[] list(); 返回一个String数组，表示该File目录中的所有子文件或文件夹
        - public File[] ListFiles(); 返回一个File数组，表示该File目录中的所有子文件或文件夹
            注意：
                List方法和ListFiles方法遍历的是构造方法中给出的目录
                如果构造方法中给出的路径不存在，就会抛出空指针异常
                如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
 */
public class Demo06File {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        //        - public String[] list(); 返回一个String数组，表示该File目录中的所有子文件或文件夹
        File file = new File("F:\\game");
        String[] arr = file.list();
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("==================");

        //        - public File[] ListFiles(); 返回一个File数组，表示该File目录中的所有子文件或文件夹
        File f2 = new File("F:\\game");
        File[] arr1 = f2.listFiles();
        for (File s: arr1) {
            System.out.println(s);
        }
    }
}
