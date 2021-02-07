/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        // 创建FileOutputStream对象，构造方法中绑定要写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("F:\\game\\java\\b.txt"));
        // 调用FileOutputStream对象中的方法write,把数据写入到文件中
        //  在文件中写100，需要写3个字节
        //  - public void write(byte[] b)；  一次写入多个字节：
            // 如果写的第一个字节是正数（0-127），那么显示的时候回查询ASCII表
            // 如果写的第一个字节是负数，那第一个字节会和第二个字节，两个字节组成一个中文显示，查询系统默认码表（GBK）
        byte[] bytes = {65,66,67,68,69};  // ABCDE
//        byte[] bytes = {-65,66,-67,68,69};  // 緽紻E
         fos.write(bytes);

        /*
            public void write(byte[] b, int off, int len) 把字节数组的一部分写入到文件中
                int off :数组的开始索引
                int len :写几个字节
         */


        /*
            写入字符串的方法：可以使用String类中的方法转换成字节数组
                byte[] getBytes() 把字符串转换为字节数组
         */
        byte[] bytess = "你好".getBytes();
        fos.write(bytess);

        fos.close();
    }
}
