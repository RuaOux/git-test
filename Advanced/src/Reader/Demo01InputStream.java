/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Reader;

import java.io.FileInputStream;
import java.io.IOException;

/*
    使用字节流读取中文文件
       一个中文
        GBK:占用两个字节
        UTF-8： 占用三个字节
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\game\\java\\a.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println((char)len);
        }
        fis.close();
    }
}
