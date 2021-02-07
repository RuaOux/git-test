/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ReverseStream;

import java.io.*;

/*
    java.io.OutputStreamWriter extends Writer
    OutputStreamWriter: 是字符流通向字节流的桥梁： 可使用指定的编码格式将要写入流中的字符编码转换为字节。(编码)
    继承自父类的共性方法：

    构造方法：
        OutputStreamWriter(OutputStream out) 创建使用默认字符编码的 OutputStreamWriter.
        OutputStreamWriter(OutputStream out, String charsetName)创建使用指定字符集的 OutputStreamWriter
        参数：
            OutputStream out：字节输出流，可以用来写转换之后的字节到文件中
            String charsetName: 指定的编码表名称,不区分大小写,可以是UTF-8,/utf-8,gbk/GBK...
            不指定默认使用UTF-8
    使用步骤：
        1. 创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        2. 使用OutputStreamWriter对象中的方法writer,把字符转换为字节存储缓冲区(编码)
        3. 释放资源
 */
public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        writer_utf_8();
        writer_gbk();
    }

    private static void writer_gbk() throws IOException {
        //1. 创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\game\\java\\gbk.txt"),"gbk");
        //2. 使用OutputStreamWriter对象中的方法writer,把字符转换为字节存储缓冲区(编码)
        osw.write("你好");
        osw.close();
    }

    /*
        使用转换流OutputStreamWriter写UTF-8格式的文件
     */
    private static void writer_utf_8() throws IOException {
        //1. 创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\game\\java\\utf_8.txt"),"utf-8");
        //2. 使用OutputStreamWriter对象中的方法writer,把字符转换为字节存储缓冲区(编码)
        osw.write("你好");
        osw.close();

    }
}
