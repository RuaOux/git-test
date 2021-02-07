/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package IO.BufferedOutputSteam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
    java.io.BufferedReader extends Reader

    继承自弗雷的共性成员方法：
        int read() 读取单个字符并返回
        int read(cher[] cbuf) 一次读取多个字符，并将字符读入数组。
        void close() 释放资源

    构造方法：
        BufferedReader(Reader in) 创建一个使用默认大小输入缓冲区的缓冲字符输入流。
        BufferedReader(Reader in, int sz) 创建一个使用指定大小输入缓冲区的缓冲字符输入流。
        参数：
            Reader in: 字符输入流
                我们可以传递FileReader,缓冲流会给FileReader增加一个缓冲区，提高FileReader的读取效率
     特有成员方法：
        String readLine() 读取一个文本行。读取一行数据
        返回值：
            包含改行的字符串，不包含任何终止符号，如果已到达流末尾，则返回 null

      使用步骤：
        1. 创建字符缓冲输入流对象，构造方法中传递字符输入流
        2. 使用字符缓冲输入流对象中的read/readLine读取文本
        3. 释放资源

 */
public class Demo04BufferedReader {
    public static void main(String[] args) throws IOException {
        //1. 创建字符缓冲输入流对象，构造方法中传递字符输入流
        BufferedReader br = new BufferedReader(new FileReader("F:\\game\\java\\bw.txt"));
        //2. 使用字符缓冲输入流对象中的read/readLine读取文本
        String line;
        while ( (line = br.readLine()) != null) {
            System.out.println(line);
        }
        //3. 释放资源
        br.close();
    }
}
