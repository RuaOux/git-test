/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo02Filter {
    public static void main(String[] args) {
        File f1 = new File("F:\\game");
        getAllFile(f1);
    }

    /*
        在File类中有两个和ListFiles重载的方法，方法的参数传递的就是过滤器。
        - File[] listFiles(FileFilter filter)
        java.io.FileFilter接口；  用于抽象路径名(File对象)的过滤器
            作用: 用来过滤文件（File对象）
            抽象方法： 用来过滤文件的方法
                boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径类表中
                    参数：
                        File pathname: 使用ListFiles方法遍历目录，得到的每一个文件对象
        - File[] ListFiles(FilenameFilter filter)
        java.io.FilenameFilter接口： 实现此接口的类实例可用于过滤器文件名。
            作用：用于过滤文件名称
            抽象方法：用来过滤的方法
                boolean accept(File dir, String name) 测试指定文件是否应该包含在某一文件类表中
                参数：
                    File dir: 构造方法中传递的被遍历的目录
                    String name: 使用ListFiles方法遍历目录，获取每一个文件/文件夹的名称
       注意事项：
            两个过滤器接口是没有实现类的 需要我们自己写实现类，重写过滤的方法accept,在方法中自己定义过滤的规则

     */
    public static void getAllFile(File dir) {
        // 使用匿名内部类 传递过滤器
        File[] files = dir.listFiles((d,name)->{
            // 过滤规则，pathname是文件夹或者是.java结尾的文件返回true
            return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".txt");
        });
/*        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                // 过滤规则，pathname是文件夹或者是.java结尾的文件返回true
                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".txt");
            }
        });*/

        // 使用Lambda表达式优化匿名内部类（使用前提只有一个抽象方法）



        for (File f : files) {
            if (f.isDirectory()) {
                getAllFile(f);
            } else {
                System.out.println(f);
            }
        }
    }
}
