/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package IO.BufferedOutputSteam;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    java.io.BufferedInputStream extends InputStream
    BufferedInputStream：字节缓冲输入流

    继承自父类的成员方法：
            int read() 读取文件中的一个字节并返回，读取到文件的末尾返回-1
            int read(); 一次读取一个字节
            int read(byte[] b);  一次读取多个字节
            void close(); 释放资源

    构造方法：
        BufferedInputStream(InputStream in) 创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用
        BufferedInputStream(InputStream in, int size) 创建一个具有指定缓冲区大小的输入流
        参数：
            InputStream in: 字节输入流
                我们可以传递FileInputStream,缓冲流会给FileInputStream增加一个缓冲区，提高FileInputStream的读取效率
            int size: 指定缓冲流内部缓冲区的大小，不指定默认

    使用步骤：
        1. 创建FileInputStream对象，构造方法中绑定要读取的数据源
        2. 创建BufferedInputStream对象，构造方法中传递FileInputStream对象，提高FileInputStream对象的读取效率
        3. 使用BuffInputStream对象中的方法read,读取文件
        4. 释放资源

 */
public class Demo01BufferedInputStream {
    public static void main(String[] args) throws IOException {
        // 1. 创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("F:\\game\\java\\prop.txt");
        // 2. 创建BufferedInputStream对象，构造方法中传递FileInputStream对象，提高FileInputStream对象的读取效率
        BufferedInputStream bis = new BufferedInputStream(fis);
        // 3. 使用BuffInputStream对象中的方法read,读取文件
/*        int len = 0; // 记录每次读取到的字符
        while((len = bis.read()) != -1) {
            System.out.print((char)len);
        }*/
        byte[] bytes = new byte[1024]; // 存储每次读取的数据
        int len = 0; // 记录每次读取的有效字节个数
        while ((len = bis.read(bytes)) != -1) {
            System.out.print(new String(bytes,0,len));
        }


        bis.close();
    }
}
