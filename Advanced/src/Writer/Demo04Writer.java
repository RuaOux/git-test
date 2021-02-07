/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
        续写和换行:
            续写，追加写：使用两个参数的构造方法
                FileWriter(String fileName, boolean append)
                FileWriter(File file, boolean append)
                参数：
                    String fileName,File file:写入数据的目的地
                    boolean append: 续写开关, true: 不会创建新的文件覆盖源文件，可以续写；
                    flase: 创建新的文件覆盖源文件

 */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("F:\\game\\java\\g.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("HelloWorld" + i + "\r\n");
        }

        fw.close();
    }
}
