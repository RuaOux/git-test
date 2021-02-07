/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
    文件上传案例的服务器端：读取客户端上传的文件，保存到服务器的硬盘，给客户端回写“上传成功”

    明确数据源：
        数据源：客户端上传的文件
        目的地：服务器的硬盘

    实现步骤：
        1. 创建一个服务器ServerSocket对象，和系统要指定的端口号
        2. 使用ServerSocket对象中的方法accept,获取到请求的客户端Socket对象
        3. 使用Socket对象中的方法get.InputStream,获取到网络字节输入流InputStream对象
        4. 判断目的地文件夹是否存在，不存在则创建一个
        5. 创建一个本地字节输出流对象FileOutputStream对象,构造方法中绑定要输出的目的地
        6. 使用网络字节输入流InputStream对象中的方法read,读取客户端上传的文件
        7. 使用本地字节输出流FileOutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘目的地
        8. 使用Socket对象中的方法get.OutputStream,获取到网络字节输入流OutputStream对象
        9. 使用网络字节输出流Outpu给客户端回写“上传成功”
        10. 释放资源(FileOutputStream,Socket,ServerSocket)


 */
public class TCPTestServer {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个服务器ServerSocket对象，和系统要指定的端口号
        ServerSocket server = new ServerSocket(8889);

        // 2. 使用ServerSocket对象中的方法accept,获取到请求的客户端Socket对象
        /*
            让服务器一直处于侦听状态（死循环accept方法)
            有一个客户端上传文件，就保存一个文件
         */
        while (true) {
            /*
                使用多线程技术，提高程序的效率
                有一个客户端上传文件，就开启一个线程完成文件的上传
             */
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //完成文件的上传
                    try {
                        Socket socket = server.accept();

                        // 3. 使用Socket对象中的方法get.InputStream,获取到网络字节输入流InputStream对象
                        InputStream is = socket.getInputStream();
                        // 4. 判断目的地文件夹是否存在，不存在则创建一个
                        File file = new File("F:\\game\\java\\upload");
                        if (!file.exists()) {
                            file.mkdir();
                        }
        /*
            自定义一个文件的命名规则：防止同名的文件被覆盖
            规则：域名+毫秒值+随机数
         */
                        String fileName = "RuaOux"+System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";

                        //5. 创建一个本地字节输出流对象FileOutputStream对象,构造方法中绑定要输出的目的地
                        FileOutputStream fos = new FileOutputStream(file + "\\" + fileName);
                        // 6. 使用网络字节输入流InputStream对象中的方法read,读取客户端上传的文件
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = is.read(bytes)) != -1) {
                            // 7. 使用本地字节输出流FileOutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘目的地
                            fos.write(bytes,0,len);
                        }
                        // 8. 使用Socket对象中的方法get.OutputStream,获取到网络字节输入流OutputStream对象
                        OutputStream os = socket.getOutputStream();
                        // 9. 使用网络字节输出流Outpu给客户端回写“上传成功”
                        os.write("上传成功".getBytes());
                        // 10. 释放资源(FileOutputStream,Socket,ServerSocket)
                        fos.close();
                        socket.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();

        }
        // 因为服务器不能关闭所以就让他进入死循环
        // server.close();
    }
}
