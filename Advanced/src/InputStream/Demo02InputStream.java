/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    字节输入流一次读取多个字节的方法：
            int read(byte[] b) 从输入流读取一定数量的字节，并将其存储在缓冲区数组 b 中。
    明确两件事情：
        1. 方法在参数byte[]的作用。
        2. 方法的返回值int是什么？

        String类的构造方法
            String (byte[] bytes) : 把字节数组转换为字符串
            String (byte[] bytes, int offset, int length) 把字节数组的一部分转换为字符串
            offset: 数组的开始索引
            length: 转换的字节个数

 */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        // 创建FileInputstream对象， 构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("F:\\game\\java\\b.txt");
        // 使用FileInputStream对象中的方法读取文件
        //             int read(byte[] b) 从输入流读取一定数量的字节，并将其存储在缓冲区数组 b 中。
/*        byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);  // 2
        System.out.println(new String(bytes));  // AB

        len = fis.read(bytes);
        System.out.println(len);  // 2
        System.out.println(new String(bytes));  // CD

        len = fis.read(bytes);
        System.out.println(len);  // 1
        System.out.println(new String(bytes));  // ED  每次读取俩个然后覆盖
        // 读到E时后面已经没有内容所以只有E 覆盖了C 而D继续保留

        len = fis.read(bytes);
        System.out.println(len);  // -1
        System.out.println(new String(bytes));  // ED*/

/*
        发现以上读取时有一个重复的过程，可以使用循环优化
        不知道文件中有多少字节，所以使用while循环
        while 循环结束的条件，读取到-1结束

 */
        byte[] bytes = new byte[1024];  // 存储读取到的多个字节
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            // String (byte[] bytes, int offset, int length) 把字节数组的一部分转换为字符串
            System.out.println(new String(bytes,0,len));
        }

        fis.close();
    }

}
