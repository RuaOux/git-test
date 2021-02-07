/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Reader;

import java.io.FileReader;
import java.io.IOException;

/*
    java.io.Reader： 字符输入流，是字符输入流的顶层父类，定义了一些共性的成员方法，是一个抽象类

    共性的成员方法：
        int read() 读取单个字符并返回
        int read(cher[] cbuf) 一次读取多个字符，并将字符读入数组。
        void close() 释放资源

     java.io.FileReader extends InputStreamReader extends Reader
     FileReader:文件字符输入流
     作用：把硬盘文件中的数据以字符方式读取到内存中

     构造方法：
        FileReader(String fileName)
        FileReader(File file)
        参数： 读取文件的数字园
                String fileName: 文件的路径
                File file: 一个文件
          FileReader构造方法的作用：
            1. 创建一个FileReader对象
            2. 会把fileReader对象指向要读取的文件
     字符输入流的使用步骤：
        1. 创建FileReader对象，构造方法中绑定要读取的数据源
        2. 使用FileReader对象中的方法read读取文件
        3. 释放资源

 */
public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        // 1. 创建FileReader对象，构造方法中绑定要读取的数据源
        FileReader fr = new FileReader("F:\\game\\java\\c.txt");
        // 2. 使用FileReader对象中的方法read读取文件
        // int read() 读取单个字符并返回
/*        int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.print((char)len);
        }*/

        // int read(cher[] cbuf) 一次读取多个字符，并将字符读入数组。
        char[] cs = new char[1024];  // 存储读取到的多个字符
        int len = 0; // 记录的是每次读取的有效字符个数
        while ((len = fr.read(cs)) != -1) {
            System.out.println(new String(cs,0,len));
        }



        fr.close();
    }
}
