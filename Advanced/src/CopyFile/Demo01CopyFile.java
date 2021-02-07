/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件复制的练习：一读一写

        明确：
            数据源："F:\game\java"
            数据的目的地: "F:\game\java\var"

       文件赋值的步骤：
        1. 创建一个字节输入流对象，构造方法中绑定要读取的数据源
        2. 创建一个字节输出流对象，构造方法中绑定要写入目的地
        3. 使用字节输入流对象中的方法read读取文件
        4. 使用字节输出流的方法write，把读取到的字节写入到目的地的文件中
        5. 释放资源
 */
public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        //         1. 创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("F:\\game\\java\\b.txt");
        //         2. 创建一个字节输出流对象，构造方法中绑定要写入目的地
        FileOutputStream fos = new FileOutputStream("F:\\game\\java\\var\\b.txt");

        //         3. 使用字节输入流对象中的方法read读取文件
        // 一次读取一个字节写入一个字节的方法
/*        int len = 0;
        while ((len = fis.read()) != -1) {
            //         4. 使用字节输出流的方法write，把读取到的字节写入到目的地的文件中
            fos.write(len);
        }*/
        // 使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(len);
        }


        //         5. 释放资源(先关闭写的流后关闭读的流）
        fos.close();
        fis.close();

    }
}
