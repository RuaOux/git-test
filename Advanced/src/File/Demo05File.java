/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package File;

import java.io.File;
import java.io.IOException;

/*
    创建删除功能的方法
        - public boolean createNewFile(); 当具有该名称的文件尚未存在时，创建一个新的空文件
            createNewFile声明抛出了 IOException,我们调用这个方法必须处理这个异常
        - public boolean delete(); 删除此File表示的文件或者目录
        - public boolean mkdir(); 创建此File表示的目录
        - public boolean mkdirs(); 既可以创建单级空文件夹，又可以创建多级文件夹
 */
public class Demo05File {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        //         - public boolean mkdir(); 创建此File表示的目录
        //        - public boolean mkdirs(); 既可以创建单级空文件夹，又可以创建多级文件夹
        File f1 = new File("F:\\game\\ModBox\\ccc\\asd");
        f1.mkdirs();

        File f2 = new File("F:\\game\\ModBox\\ccc\\asd\\abc");
        f2.mkdir();

        f2.delete();

        File f3 = new File("F:\\game\\ModBox\\ccc");
        f3.delete();
    }

    private static void show01() {
        File f1 = new File("F:\\game\\ModBox\\1.txt");
        try {
            boolean b1 = f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
