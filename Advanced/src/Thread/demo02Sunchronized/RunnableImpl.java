/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.demo02Sunchronized;
/*
    解决线程安全问题的第二种方案：使用同步方法
        使用步骤：
            1. 把访问了共享数据的代码块抽取出来，放到一个方法中
            2. 在方法上添加synchronized 修饰符

    格式： 定义方法的格式
        修饰符 synchronized 返回值类型 方法名（参数列表） {
                可能会出现线程安全问题的代码（访问了共享数据的代码）
            }
 */
public class RunnableImpl implements Runnable{
    // 定义一个多线程共享的票源
    private int ticket = 100;

    // 设置线程任务

    @Override
    public void run() {
        // 先判断票是否存在
        while (true) {
          payTicket();
        }
    }

    /*
        定义一个同步方法
        同步方法也会把方法内部的代码锁住
        只让一个线程执行
        同步方法的锁对象是谁？
        就是实现类对象 new RunnableImpl()
        也就是this
     */

    public synchronized void payTicket() {
        if (ticket > 0) {

            // 票存在、卖票 ticket--
            System.out.println(Thread.currentThread().getName()+ "-->正在卖第" + ticket + "张票");
            ticket--;
        }
    }

}
