/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package CopyFile;

import java.io.*;

/*
    文件复制练习： 一读一写
        明确：
            数据源：
            数据目的地：
        文件复制的步骤：
            1. 创建字节缓冲输入流对象，构造方法中传递字节输入流
            2. 创建字节缓冲输出流对象，构造方法中传递字节输出流
            3. 使用字节缓冲输入流对象中的方法read,读取文件
            4. 使用字节缓冲输出六中的方法write,把读取的数据写入到内部缓冲区中  bos.write(bytes,0,len);
            5. 释放资源
 */
public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //1. 创建字节缓冲输入流对象，构造方法中传递字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\game\\java\\prop.txt"));
        //2. 创建字节缓冲输出流对象，构造方法中传递字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\game\\java\\var\\prop.txt"));
        //3. 使用字节缓冲输入流对象中的方法read,读取文件
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();

        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时：" + (e-s) + "毫秒");
    }
}
