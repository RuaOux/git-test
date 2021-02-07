/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.Runnable;
/*
    创建多线程的第二种方式：实现Runnable接口
    java.lang.Runnabale
        Runnable 接口应该由那些打算通过某一条线程执行其实例的类来实现，类必须定义一个成为 run 的无参构造方法
    java.lang.Thread类的构造方法
        Thread(Runnable target) 分配新的 Thread 对象
        Thread(Runnable target, String name) 分配新的 Thread 对象

    实现步骤：
        1. 创建一个Runnable接口的实现类
        2. 在实现类中重写Runnable接口的run方法，设置线程任务
        3. 创建一个Runnable接口的实现类对象
        4. 创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        5. 调用Thread类中的start方法，开启新的线程执行run方法

    实现Runnable接口创建多线程程序的好处：
        1. 避免了单继承的局限性
            一个类只能继承一个类（一个人只能有一个亲爹），类继承了Thread类就不能继承其他类
            实现了Runnable接口，还可以继承其他的类，实现其他的接口
        2. 增强了程序的扩展性，降低了程序的调合性（解耦）
            实现了Runnable接口的方式，把设置线程任务和开始新线程进行了分离（解耦）
            实现类中，重写了run方法，用来设置线程任务
            创建Thread类对象，使用start方法，用来开启新线程

 */
public class Demo01Runnable {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t = new Thread(run);
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
