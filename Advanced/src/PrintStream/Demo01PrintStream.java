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
    java.io.PrintStream:打印流
        PrintStream:为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式。
    PrintStream的特点：
        1. 只负责数据的输出，不负责的读取。
        2. 与其他输出不同，PrintStream 永远不会抛出 IOException
        3. 有特有的方法, print, println
            void print(任意类型的值)
            void println（任意类型的值并换行)
    PrintStream extends OutputStream
        继承自父类的成员方法：
            - void write(int c) 写入单个字节。
            - void write(char[] cbuf) 写入字符数组。
            - abstract void write(char[] cbuf, int off, int len) 写入字符数组的某一部分，
            从off数组的开始索引，len写的字符个数
            - void write(String str)写入字符串。
            - void write(String str, int off, int len) 写入字符串的额某一部分，
            - void flush() 刷新该流的缓冲
            - void close() 关闭此流， 但要先刷新它

    构造方法:
        PrintStream(File file)：输出的目的地是一个文件
        PrintStream(OutputStream out):输出目的地是一个字节输出流
        PrintStream(String fileName)：输出的目的地是一个文件路径

    注意：
        如果使用继承自父类的write方法写数据，那么查看数据的时候回查询编码表 97->a
        如果使用自己特有的方法print/println方法写数据，写的数据原样输出 97->97
    使用步骤：1.创建打印流printStream对象，构造方法中绑定要输出的目的地。
            2.(1)如果使用继承自父类的write方法写数据，那么查看数据的时候回查询编码表 97->a
              (2)如果使用自己特有的方法print/println方法写数据，写的数据原样输出 97->97
            3.释放资源


 */
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建打印流printStream对象，构造方法中绑定要输出的目的地。
        PrintStream ps = new PrintStream("F:\\game\\java\\print.txt");
        // 如果使用继承自父类的write方法写数据，那么查看数据的时候回查询编码表 97->a
        ps.write(97);
        // 如果使用自己特有的方法print/println方法写数据，写的数据原样输出 97->97
        ps.println(97);
        ps.close();
    }
}
