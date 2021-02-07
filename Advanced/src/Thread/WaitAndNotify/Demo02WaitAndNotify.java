/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.WaitAndNotify;
/*
    进入到TimeWaiting（计时等待）有两种方式
    1.  使用sleep()方法，在毫秒值结束之后，线程唤醒进入到Runnable/Blocked状态
    2.  使用wait()方法，wait方法如果在毫秒值结束之后还没有被notify唤醒，
    就会自动醒来，线程睡醒进入到Runnable/Blocked状态

    唤醒的方法：
        void notify() 唤醒在此等待的线程
        void notifyAll()  唤醒所有等待的线程
 */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        // 创建一个顾客线程
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    // 保证等待和唤醒的线程只能有一个执行需要使用同步技术
                    synchronized (obj) {
                        System.out.println("告知老板要的包子的种类和数量。");
                        // 调用wait方法，
                        // 放弃CPU的执行，进入到WAITING状态（无线等待）
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后的代码
                        System.out.println("包子做好了，开吃");
                        System.out.println("===========");
                    }
                }
            }
        }.start();
    }
}
