/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package trycatch;

import java.io.FileWriter;
import java.io.IOException;

/*
    在jdk1.7之前使用try catch finally 处理流中的异常
        格式：
            try{
                可能会产生异常的代码
            } catch (异常类变量 变量名) {
                异常的处理逻辑
            } finally {
                一定会执行的代码
                资源释放
            }

 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        // 提高变量fw的作用域,让finally可以使用
        // 变量在定义的时候，可以没有值，但是使用的时候必须有值
        //            FileWriter fw = new FileWriter("F:\\game\\java\\g.txt",true);
        // 执行失败，fw没有值，fw.close会报错
        FileWriter fw = null;

        try {
            fw = new FileWriter("F:\\game\\java\\g.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("HelloWorld" + i + "\r\n");
            }
        } catch (IOException e) {

        } finally {
           if(fw!=null) {
               try {
                   // fw.close方法声明抛出了IOException异常对象，所以我们就得处理这个异常对象，要么throws,要么try catch
                   fw.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
        }

    }
}
