/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.util.Throwalbe:类是 java 语言中所有错误或异常的超类。
       // Exception: 编译期异常：进行编译（写代码）java程序出现的问题。
            RuntimeExcepetion：运行期异常： java程序运行过程中出现的问题
            异常就相当于程序得了一个小毛病（感冒、发烧），把异常处理掉程序就可以继续执行（吃药继续上班）
        Erren:错误
            错误就相当于程序得了无法治愈的毛病（非典、艾滋），必须修改源代码，程序才能继续执行。
 */
public class Demo01Exception {
    public static void main(String[] args) {
        // Exception: 编译期异常：进行编译（写代码）java程序出现的问题。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 用来格式化日期
       /* try {
            Date date = sdf.parse("2020081");
        } catch (ParseException e) {
            e.printStackTrace();
        }*/

        // 运行过程中才出现的异常
        int[] arr = {1,2,3};
        try {
            // 可能会出现异常的代码
            System.out.println(arr[3]);

        } catch (Exception e) {
            // 异常的处理逻辑
            System.out.println(e);
        }
        System.out.println("后续代码");

        // Error:错误
        // int[] arr1 = new int[1024*1024*1024];
        // 内存溢出的错误 创建的数组太大了  超出了给JVM分配的内存
        // System.out.println(arr1);
    }
}
