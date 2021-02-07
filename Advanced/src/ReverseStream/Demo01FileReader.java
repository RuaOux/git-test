/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ReverseStream;

import java.io.FileReader;
import java.io.IOException;

/*
    FileReader可以读取默认编码格式(UTF-8)的文件
    FileReader读取系统默认编码(中文GBK)会产生乱码
 */
public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\game\\java\\我是GBK的文件.txt");
        int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.println((char)len);
        }
        fr.close();
    }
}
