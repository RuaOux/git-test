/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.getName;
/*
    获取线程的名称：
        1. 使用Thread类中的方法getname();
            String getName() 返回线程的名称。
        2. 可以先获取当前正在执行的线程，使用线程中的方法getName（）获取线程的名称
            static Thread currentThread() 返回对当前正在执行的线程对象的引用。
 */
// 定义一个Thread类的子类
public class MyThread extends Thread{
    // 重写一下run方法

    @Override
    public void run() {
        // 获取线程的名称
        //  String name = getName();
        //  System.out.println(name);

       //   Thread t =Thread.currentThread();
       //   System.out.println(t);
        System.out.println(Thread.currentThread().getName());

    }
}
