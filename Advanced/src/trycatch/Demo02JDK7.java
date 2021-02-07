/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package trycatch;
/*
    JDK7的新特性
    在try的后边可以增加一个（）,在括号中可以定义流对象
    那么这个流对象的作用域就在try中有效
    try中的代码执行完毕，会自动把流对象释放，不用写finally
        格式：
            try (定义流对象;定义流对象){
                可能会产生异常的代码
            } catch (异常类变量 变量名) {
                异常的处理逻辑
            }
 */
public class Demo02JDK7 {
    public static void main(String[] args) {
        
    }
}
