/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Exception;

import java.io.IOException;

/*
    finally代码块
        在try{

            } catch{

        }  finally{
            无论是否出现异常都会执行的代码
        }
        注意：
            1. finally不能单独使用，必须和try一起使用
            2. finally一股用于资源释放（资源回收），无论程序是否出现异常，最后都要资源释放{IO}
     */
public class Demo07TryCatchFinally {
        public static void main(String[] args) {
            try {
                 // 可能会产生异常的代码
                readFile("c:\\a.tx");
            } catch (IOException e) {
                // 出现异常后的处理逻辑
                e.printStackTrace();
            } finally {
                // 无论是否出现异常都会执行
                System.out.println("资源释放");
            }
        }


        public static void readFile(String filEName) throws IOException {
        if (!filEName.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }

        System.out.println("路径没有问题，读取文件");
    }
}
