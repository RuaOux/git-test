/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.Lambda;
/*
    使用实现Runnable接口的方法实现多线程程序
 */
public class Demo01Runnable {
    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        // 创建Thread类对象,构造方法中传递Runnable接口中的实现类
        Thread t = new Thread(run);
        // 调用start方法开启新线程
        t.start();

        // 简化代码  使用匿名内部类 实现多线程程序

        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新新新");
            }
        }).start();

    }
}
