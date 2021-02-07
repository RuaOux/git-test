/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.Lambda;
/*
    Lambda表达式的标准格式：
        有三部分组成：
            1. 一些参数
            2. 一个箭头
            3. 一段代码
        格式：
            （参数列表） -> {一些重写方法的代码};
        解释说明格式：
            （）：接口中抽象方法的参数列表，没有参数，就空着，有参数就写出参数，多个参数使用逗号分隔
            -> : 传递的意思，把参数传递给方法体{}
            {} : 重写接口的抽象方法体
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        // 使用匿名内部类的方式，实现多线程
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新新新");
            }
        }).start();

        // 使用Lambda表达式实现多线程
        new Thread(() ->{
                System.out.println(Thread.currentThread().getName()+"新新新");
        }).start();

        // 优化省略Lambda
        new Thread(() ->System.out.println(Thread.currentThread().getName()+"新新新")).start();


    }
}
