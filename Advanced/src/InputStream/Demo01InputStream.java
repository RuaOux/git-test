/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.InputStream 字节输入流
        此抽象类是表示字节输入流的所有类的父类

        定义了所有子类共性的方法：
            int read(); 一次读取一个字节
            int read(byte[] b);  一次读取多个字节
            void close(); 释放资源

    java.io.FileInputStream extends InputStream
    FileInputStream：
        作用：把硬盘文件中的数据，读取到内存中使用

        构造方法：
            FileInputStream(String name)
            FileInputStream(File file)
            参数： 读取文件的数据源
                String name: 文件的路径
                File file: 文件
            构造方法的作用：
                1.会创建一个FileInputStream对象
                2.会把FileInputStream对象指定构造方法中要读取的文件

      读取数据的原理：(硬盘-->内存)
            java程序-->JVM-->OS-->OS读取数据的方法-->读取文件

      字节输入流的使用步骤（重点）：
        1.创建FileInputStream对象，构造方法中绑定要读取的数据源
        2.使用FileInputStream对象中的方法read,读取文件
        3.释放资源

 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("F:\\game\\java\\a.txt");
        //2.使用FileInputStream对象中的方法read,读取文件\
        // int read() 读取文件中的一个字节并返回，读取到文件的末尾返回-1
/*        int read = fis.read();
        System.out.println(read);
        read = fis.read();
        System.out.println(read);
        read = fis.read();
        System.out.println(read);
        read = fis.read();
        System.out.println(read);*/
        int len = 0; // 记录读取到字节

        // 布尔表达式 (len = fis.read()) != -1
        // 1. fis.read():读取一个字节
        // 2. len = fis.read(); 把读取到的字节赋值给变量len
        // 3. (len = fis.read() != -1) 判断变量len是否不等于-1
        while ((len = fis.read()) != -1) {
            System.out.print((char)len);
        }
        fis.close();
        // 3.释放资源

    }
}
