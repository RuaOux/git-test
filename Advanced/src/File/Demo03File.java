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
    File类获取功能的方法
        - public String getAbsolutePath(); 返回File的绝对路径
        - public String getPath(); 返回File的路径名字符串
        - public String getName(); 返回File的文件或者文件夹名称
        - public Long length(); 返回此File的文件大小(以字节为单位)
            注意：
                文件夹是没有大小概念的，不能获取文件夹的大小
                如果构造方法中给出的路径不存在，那么length方法返回0
                只能返回文件大小
 */
public class Demo03File {
    public static void main(String[] args) {
        show01();
        shou02();
        show03();
        show04();
    }

    private static void show04() {
        File f1 = new File("F:\\game\\ModBox\\changelog.txt");
        System.out.println(f1.length());
    }

    private static void show03() {
        File f1 = new File("c:\\A.TXT");
        File f2 = new File("C:\\acb");
        System.out.println(f1.getName());
        System.out.println(f2.getName());
    }

    private static void shou02() {
        /*
            - public String getPath(); 将此File转换为路径名字符串
         */
        File f1 = new File("c:\\A.TXT");
        String absoluteFile = f1.getPath();
        System.out.println(absoluteFile);

        File f2 = new File("a.txt");
        String absoluteFile1 = f2.getPath();
        System.out.println(absoluteFile1);
    }

    private static void show01() {
        /*
            - public String getAbsolutePath(); 返回此File的绝对路径名字符串
            获取的构造方法中传递的路径：
            无论路径是绝对的还是相对的都返回绝对路径
         */
        File f1 = new File("c:\\A.TXT");
        File absoluteFile = f1.getAbsoluteFile();
        System.out.println(absoluteFile);

        File f2 = new File("a.txt");
        File absoluteFile1 = f2.getAbsoluteFile();
        System.out.println(absoluteFile1);
    }
}
