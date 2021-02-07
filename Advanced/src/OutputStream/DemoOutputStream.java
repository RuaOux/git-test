/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    追加写入数据的方法：使用两个参数的构造方法
        	如何追加写入数据的方法：使用两个参数的构造方法（此为避免每次运行都要重新创建文件覆盖重新写入而存在的）
	        FileOutputStream(String name, boolean append) 创建一个向具有指定 name 的文件中写入数据的输出文件夹。
	        FileOutputStream(File file, boolean append)  创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
	            参数：
	                String name, File file: 写入数据的目的地
	                boolean append: 追加写开关
	                true: 创建对象不会覆盖原文件，继续在文件的末尾追加写数据
	                false: 创建一个新文件，覆盖原文件
	 写换行：写换行符号
	    windows:/r/n
	    linux:/n
	    mac:/r
 */
public class DemoOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\game\\java\\c.txt",true);
        for (int i  = 1; i <= 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();


    }
}
