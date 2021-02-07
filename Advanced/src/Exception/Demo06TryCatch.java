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
    try...catch：异常处理的第二种方式： 自己处理异常
    格式：
        try {
            可能产生异常的代码
         }  catch(定义一个异常的变量，用来接收try中抛出的异常对象) {
            异常的处理逻辑，产生异常对象之后，怎么处理异常对象
            一般在工作中，会把异常的信息记录到一个日志中
         }
         ...
         catch (异常类名 变量名){

         }
    注意：
        1.try中可能会抛出多个异常对象，那么久可以使用多个catch来处理这些异常对象
        2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，
        继续执行try...catch之后的代码
          如果try中没有产生异常，那么就不会执行catch中异常的处理逻辑，执行完try中的代码，
          即可继续执行try...catch只有的代码

 */
public class Demo06TryCatch {
    public static void main(String[] args) {
        try {
            readFile("d:\\a.tx");
        } catch (IOException e) {

            // try中抛出什么异常对象，catch就定义什么异常变量，用来接收这个异常对象
           // System.out.println("catch  传递的文件后缀不是.txt");
            System.out.println(e.getMessage());  //  文件的后缀名不对
            System.out.println(e.toString());
            e.printStackTrace();

        }
        /*
            Throwalbe类中定义了三个异常处理方法
            String getMessage() 返回此 throwable 的简短描述。
            String toString()  返回此 throwable 的详细信息字符串。
            void printStackTrace() JVM打印异常对象，默认此方法，打印的异常信息是最全面的。
         */



        System.out.println("后续代码");
    }
    public static void readFile(String filEName) throws IOException {
        if (!filEName.equals(".txt")) {
            throw new IOException("文件的后缀名不对");
        }

        System.out.println("路径没有问题，读取文件");
    }
}
