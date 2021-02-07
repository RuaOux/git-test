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

/*
    创建过滤器FileFilter的实现类，重写过滤方法accept，定义过滤规则
 */
public class FileFilterImpl implements FileFilter {

    @Override
    public boolean accept(File pathname) {
       if (pathname.isDirectory()) {
           return true;
       }
       return  pathname.getName().toLowerCase().endsWith(".txt");
    }
}
