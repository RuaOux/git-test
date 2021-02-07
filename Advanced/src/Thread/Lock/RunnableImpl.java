/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    解决线程安全问题的第三种方案：使用Lock锁
    java.util.concurrent.Locks.lock接口
    Lock 实现提供了比使用 synchronized 方法和语句即可获得的更广泛的锁定操作
    Lock 接口中的方法：
        void Lock();  获取锁
        void unLock(); 释放锁。

      java.util.concurrent.Locks.Reentrantlock implements lock 接口

      使用步骤：
        1. 在成员位置创建一个Reentrantlock对象
        2. 在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁
        3. 在可能会出现安全问题的代码后调用Lock接口中的方法unLock释放锁

 */
public class RunnableImpl implements Runnable{
    // 定义一个多线程共享的票源
    private int ticket = 100;
    // 1. 在成员位置创建一个ReentrantLock对象
    Lock i = new ReentrantLock();

    @Override
    public void run() {
        // 先判断票是否存在
        while (true) {
           //  2. 在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁
            i.lock();
            if (ticket > 0) {
                // 提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                    // 票存在、卖票 ticket--
                    System.out.println(Thread.currentThread().getName()+ "-->正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    //3. 在可能会出现安全问题的代码后调用Lock接口中的方法unLock释放锁
                    i.unlock();  // 无论程序是否异常，都会把锁释放
                }



            }

        }
    }
}
