/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    线程池： JDK1.5之后提供的
    java.util.concurrent.Executors: 线程池的工厂类，用来生产线程池
    Executors类中的静态方法：
        static ExecutorService newFixedThreadPool (int nThread) 创建一个可重用固定线程数的线程池
        参数：
            int nThread: 创建线程池中包含的线程数量
        返回值：
            ExecutorService接口：返回的是ExecutorService接口的实现类对象，
            我们可以使用ExecutorService接口接受(面向接口编程)
    java.util.concurrent.Executors：线程池接口
        用来从线程池中获取线程，调用start方法，执行线程任务
            submit (Runnable tash) 提交一个 Runnable 任务用于执行

        关闭/销毁线程池的方法（了解）
            void shutdown()

    线程池的使用步骤：
        1. 使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        2. 创建一个类，实现Runnable接口、重写run方法、设置线程任务
        3. 调用ExecutorService中的方法submit,传递线程任务（实现类），开启线程，执行run方法
        4. 调用ExecutorService中的方法 shutdown销毁线程池（不建议执行、因为线程池是为了反复利用）
 */
public class Demo01ThreadPool {
    public static void main(String[] args) {
        // 1. 使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        ExecutorService se = Executors.newFixedThreadPool(2);
        // 3. 调用ExecutorService中的方法submit,传递线程任务（实现类），开启线程，执行run方法
        se.submit(new RunnableImpl());
        // 线程池会一直开启、使用完了线程，会自动把线程归还给线程池，线程可以继续使用
        se.submit(new RunnableImpl());
        se.submit(new RunnableImpl());

    }
}
