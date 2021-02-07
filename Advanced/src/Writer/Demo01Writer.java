/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.writer：字符输出流，是所有字符输出流的顶层父类，是一个抽象类
        共性的成员方法：
            - void write(int c) 写入单个字节。
            - void write(char[] cbuf) 写入字符数组。
            - abstract void write(char[] cbuf, int off, int len) 写入字符数组的某一部分，
            从off数组的开始索引，len写的字符个数
            - void write(String str)写入字符串。
            - void write(String str, int off, int len) 写入字符串的额某一部分，
            - void flush() 刷新该流的缓冲
            - void close() 关闭此流， 但要先刷新它

        java.io.FileWriter extends OutputStreamWriter extends writer
        FileWriter: 文件字符输出流
            作用：把内存中字符数据写入到文件中

        构造方法：
            FileWriter(File file)  根据给定的 File 对象构造一个 FileWriter 对象
            FileWriter(String fileName) 根据给定的 文件名构造一个 FileWriter 对象
            参数： 写入数据的目的地
                    String fileName: 文件的路径
                    File file: 是一个文件
            构造方法的作用：
                1. 会创建一个FileWriter对象
                2. 会根据构造方法中传递的文件/文件的路径，创建文件
                3. 会把FileWriter对象指向创建好的文件

        字符输出流的使用步骤：（重点）
            1. 创建FileWriter对象，构造方法中绑定要写入数据的目的地。
            2. 使用FileWriter中的方法write,把数据写入到内存缓冲区中（字符转换字节的过程）
            3. 使用FileWriter中的方法flush,把内存缓冲区中的数据吗，刷新到文件中
            4. 释放资源（会先把内存缓冲区中的数据刷新到文件中）
 */
public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        //             1. 创建FileWriter对象，构造方法中绑定要写入数据的目的地。
        FileWriter fw = new FileWriter("F:\\game\\java\\d.txt");
        //            2. 使用FileWriter中的方法write,把数据写入到内存缓冲区中（字符转换字节的过程）
        //            - void write(int c) 写入单个字节。
        fw.write(97);
        //            3. 使用FileWriter中的方法flush,把内存缓冲区中的数据吗，刷新到文件中
        fw.flush();
        //            4. 释放资源（会先把内存缓冲区中的数据刷新到文件中）
        fw.close();


    }
}
