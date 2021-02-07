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
    File判断功能的方法
        - public boolean exists(); 此方法表明File表示的文件或者文件夹是否存在
        - public boolean isDirectory(); 表示此File是否为目录
        - public boolean isFile(); 表示此是否为文件
            注意：
                电脑的硬盘中只有文件/文件夹，两个方法是互斥的
                这两个方法的使用前提，路径必须是存在的否则都返回false
 */
public class Demo04File {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        // - public boolean isDirectory(); 表示此File是否为目录
        // - public boolean isFile(); 表示此是否为文件
        File f1 = new File("F:\\game\\ModBox");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
    }

    private static void show01() {
        // - public boolean exists(); 此方法表明File表示的文件或者文件夹是否存在
        File f1 = new File("F:\\game\\ModBox");
        System.out.println(f1.exists());  // true
        File f2 = new File("F:\\game\\ModBo");
        System.out.println(f2.exists());  // false
    }
}
