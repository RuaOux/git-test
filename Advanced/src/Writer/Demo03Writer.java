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
    字符输出流写数据的其他方法：
            - void write(int c) 写入单个字节。
            - void write(char[] cbuf) 写入字符数组。
            - abstract void write(char[] cbuf, int off, int len) 写入字符数组的某一部分，
            从off数组的开始索引，len写的字符个数
            - void write(String str)写入字符串。
            - void write(String str, int off, int len) 写入字符串的额某一部分，
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("F:\\game\\java\\f.txt");
        char[] cs = {'a','b','c','d','e'};
        // void write(char[] cbuf) 写入字符数组。
        fw.write(cs);

        //            - abstract void write(char[] cbuf, int off, int len) 写入字符数组的某一部分，
        fw.write(cs,1,3);

        //             - void write(String str)写入字符串。
        fw.write("RuaOux");

        //             - void write(String str, int off, int len) 写入字符串的额某一部分，
        fw.write("黑马程序员",2,3);

        fw.close();

    }
}
