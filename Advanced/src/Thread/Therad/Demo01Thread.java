/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.Therad;
/*
    创建多线程序的第一种方式：创建Thread类的子类
    java.lang.Thread类：是描述线程的类，我们想要实现多线程程序，就必须继承Thread类

    实现步骤：
        1. 创建一个Thread类的子类
        2. 在Thread类的子类中重写Thread类中的方法，设置线程任务（开启线程要做什么）
        3. 创建Thread类的子类对象
        4. 调用Thread类中的方法start方法，开启新的线程，执行run方法
            void start() 使该线程开始执行： java 虚拟机调用该线程的 run 方法
            结果是两个线程并发的运行，当前线程（main线程）和另一个线程（创建的新线程，执行其 run 方法）。
            多次启动一个线程是非法的。，特别是当线程已经结束执行后，不能再重新启动。
     java程序属于抢占式调度，哪个线程的优先级高，哪个线程优先执行；同一个优先级，随机选择一个执行
 */
public class Demo01Thread {
    public static void main(String[] args) {
        // 3. 创建Thread类的子类对象
        MyThread mt = new MyThread();
        //  4. 调用Thread类中的方法start方法，开启新的线程，执行run方法
        mt.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main" + i);
        }
    }
}
