/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Exception;

import java.util.Objects;

/*
    Objects类中的静态方法
    public static <T> T reqioreMonNull (T obj): 查看指定引用对象不是null
 */
public class Demo04Objects {
    public static void main(String[] args) {

        method(null);

    }
    public static void method(Object obj) {
//        if (obj == null) {
//            throw new NullPointerException("传递的对象的值是null");
//        }
       // Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的对象的值是null");
    }
}
