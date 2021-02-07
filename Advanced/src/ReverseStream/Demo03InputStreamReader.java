/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ReverseStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    java.io.InputStreamReader extends Reader
    InputStreamReader:是字节流通向字符流的桥梁：它使用指定的 charset 读取字节并将其解码为字符。（把看不懂的变成能看懂的）

    继承自父类的共性方法：

    构造方法：
        InputStreamReader(InputStream in) 创建一个使用默认字符集的 InputStreamReader
        InputStreamReader(InputStream in, String charsetName)创建使用指定字符集的 InputStreamReader
        参数：
            InputStream in：字节输入流，用来读取文件中保存的字节
            String charsetName：指定的编码表名称，不区分大小写 utf-8,gbk
     使用步骤：
        1. 创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        2. 使用InputStreamRedaer对象中的方法read读取文件
        3. 释放资源
     注意事项：
        构造方法中指定的编码表名称要和文件的编码相同，否则会发生乱码

 */
public class Demo03InputStreamReader {
    public static void main(String[] args) throws IOException {
        read_utf_8();
    }
/*
    使用InputStreamReader读取UTF-8格式的文件
 */
    private static void read_utf_8() throws IOException {
        //1. 创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\game\\java\\utf_8.txt"),"utf-8");
        // 2. 使用InputStreamRedaer对象中的方法read读取文件
        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.print((char)len);
        }
        isr.close();
    }
}
