/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package File;

import java.io.File;

/*
    路径：
        绝对路径：是一个完整的路径
            以盘符(c:,d:) 开始的路径
            F:\\game
        相对路径：是一个简化路径
            相对：指的是当前项目的根目录(F:]\game)
            如果使用当前项目的根目录，路径可以简化书写
            F:\\game\\123.txt  简化为: 123.txt(可以省略项目的根目录)

            注意：
                1. 路径是不区分大小写
                2. 路径中的文件名称分隔符windows使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
 */
public class Demo02File {
    /*
        File类的构造方法
     */
    public static void main(String[] args) {
        show01();
        show02("c:\\","a.txt");
        show03();
    }

    private static void show03() {
        /*
            File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例
        参数： 把路径分成了两部分
            String parent: 父路径
            String child : 子路径
        好处：
              父路径和子路径，可以单独书写，使用起来非常灵活；父路径和子路径都可以变化。
              父路径是File类型，可以使用File的方法对路径进行一些操作，在使用路径创建对象
         */
        File parent = new File("c:\\");
        File file = new File(parent,"Hello.java");
        System.out.println(file);  // c:\Hello.java
    }

    private static void show02(String parent, String child) {
        /*
      File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例
        参数： 把路径分成了两部分
            String parent: 父路径
            String child : 子路径
        好处：
            父路径和子路径，可以单独书写，使用起来非常灵活；父路径和子路径都可以变化。
         */
        File file = new File(parent,child);
        System.out.println(file);
    }

    private static void show01() {
        /*
            File(String pathname)  通过将指定路径名字符串转换为抽象路径名来创建一个新 File 实例。
            参数：
                String pathname: 字符串的路径名称
                    路径可以是以文件结尾、也可以是以文件夹结尾
                    路径可以是相对路径、也可以是绝对路径
                    路径可以是存在、也可以是不存在
                    创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
         */

        File f1 = new File("F:\\game");
        System.out.println(f1); // 重写了Object类的toString方法 F:\game

    }
}
