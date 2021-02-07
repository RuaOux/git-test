/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.ThreadSafe;
/*
    实现卖票案例
 */
public class RunnableImpl implements Runnable{
    // 定义一个多线程共享的票源
    private int ticket = 100;

    // 设置线程任务

    @Override
    public void run() {
        // 先判断票是否存在
        while (true) {
            if (ticket > 0) {
                // 提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 票存在、卖票 ticket--
                System.out.println(Thread.currentThread().getName()+ "-->正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
