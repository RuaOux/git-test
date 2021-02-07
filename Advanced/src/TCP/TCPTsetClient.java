/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package TCP;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
/*
    TCP通信的文件上传案例
    原理：客户端读取本地的文件，把文件上传到服务器，服务器在把上传的文件保存到服务器的硬盘上

   实现步骤：
    1. 客户端使用本地的字节输入流，读取要上传的文件
    2. 客户端使用网络字节输出流，把读取到的文件上传到服务器
    3. 服务器使用网络字节输入流，读取客户端上传的文件
    4. 服务器使用本地的字节输出流，把读取到的文件，保存到服务器的硬盘上
    5. 服务器使用网络字节输出流，给客户端回写一个“上传成功”
    6. 客户端使用网络字节输入流读取回写的数据，
    7. 释放资源

    文件上传案例的客户端：读取本地文件，上传到服务器，读取服务器回写的数据
    明确：
        数据源：
        目的地：服务器

   实现步骤：
        1. 创建一个本地字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
        2. 创建一个客户端SocKet对象，构造方法中绑定服务器的IP地址和端口号
        3. 使用Socket中的方法，getOutputStream，获取网络字节输出流OutputStream对象
        4. 使用本地字节输入流FileInputStream对象中的方法read,读取本地文件
        5. 使用网络字节输出流OutputStream对象中的方法write,把读取到的文件上传到服务器
        6. 使用Socket中的方法，getInputStream，获取网络字节输出流getInputStream对象
        7. 使用网络字节输入流InputStream对象中的方法read读取服务器回写的数据
        8. 释放资源(FileInputStream,Socket)
 */
public class TCPTsetClient {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个本地字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("F:\\game\\java\\xxx.jpg");
        // 2. 创建一个客户端SocKet对象，构造方法中绑定服务器的IP地址和端口号
        Socket socket = new Socket("192.168.33.1", 8889);
        // 3. 使用Socket中的方法，getOutputStream，获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        // 4. 使用本地字节输入流FileInputStream对象中的方法read,读取本地文件
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            // 5. 使用网络字节输出流OutputStream对象中的方法write,把读取到的文件上传到服务器
            os.write(bytes, 0, len);
        }
        /*
            解决read的阻塞状态
            解决：上传完文件，给服务器写一个结束标记
            void shutdownOutput() 禁用此套接字的输出流。
         */
        socket.shutdownOutput();
        // 6. 使用Socket中的方法，getInputStream，获取网络字节输出流getInputStream对象
        InputStream is = socket.getInputStream();
        // 7. 使用网络字节输入流InputStream对象中的方法read读取服务器回写的数据
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        //8. 释放资源(FileInputStream,Socket)
        fis.close();
        socket.close();
    }
}