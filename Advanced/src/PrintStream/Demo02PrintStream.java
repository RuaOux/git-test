/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    可以改变输出语句的目的地，（打印流的流向）
    输出语句，默认在控制台
    使用System.setOut方法改变输出语句目的地改为参数中传递的打印流的目的地
        static void setOut(PrintStream out)
            重新分配"标准"输出流

 */
public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是在控制台输出");
        PrintStream ps = new PrintStream("F:\\game\\java\\我是在控制台输出.txt");
        System.setOut(ps);  // 把输出语句的目的地改变为打印流的目的地
        System.out.println("我在打印流的目的地中输出");
        ps.close();
    }
}
