/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package IO.BufferedOutputSteam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.BufferedOutputStream extends OutputSteam
    BufferedOutputStream: 字节缓冲输出流

    继承自父类的共性成员方法：
        与IO流的字节输出流基本一致

    构造方法：
        BufferedOutputStream(OutputStream out) 创建一个新的缓冲输出流，以将数据写入指定的底层输出流
        BufferedOutputStream(OutputStream out, int size) 创建一个新的缓冲输出流，
        以将具有指定缓冲区大小的数据写入指定的底层输出流。
        参数：
            OutputStream：字节输出流
                我们可以传递FileOutputStream,缓冲流会给FileOutputStream增加一个缓冲区，
                提高FileOutputStream写入效率
            int size: 指定缓冲区的大小，不指定就默认
     使用步骤（重点）：
        1. 创建FileOutputStream对象，构造方法中绑定要输出的目的地
        2. 创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileOutputStream对象效率
        3. 使用BufferedOutputStream对象中的方法write,把数据写入到内部缓冲区中
        4. 使用BufferedOutputStream对象中的方法flush,把内部缓冲区的数据刷新到文件中
        5. 释放资源（会先调用flush方法刷新数据，第四部可以省略)


 */
public class Demo01BufferedOutputSteam {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        //1. 创建FileOutputStream对象，构造方法中绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream("F:\\game\\java\\IO.txt");
        //2. 创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileOutputStream对象效率
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //3. 使用BufferedOutputStream对象中的方法write,把数据写入到内部缓冲区中
        bos.write("我把数据写入到内部缓冲区中".getBytes());
        //5. 释放资源（会先调用flush方法刷新数据，第四部可以省略)
        bos.close();
    }
}
