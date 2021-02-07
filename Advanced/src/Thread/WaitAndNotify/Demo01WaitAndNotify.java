/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.WaitAndNotify;
/*
     等待唤醒案例，线程之间的通信
        创建一个顾客线程（消费者）：告知老板要的包子的数量和种类，调用wait方法，
        放弃CPU的执行，进入到WAITING状态（无线等待）
        创建一个老板线程（生产者）：花了5秒做包子，做好包子后，调用notify方法，唤醒顾客吃包子

     注意：
        顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
        同步使用的锁对象必须保证唯一
        只有锁对象才能调用waith额notify方法

      Object类中的方法
      void wait()
        在其他线程调用此对象的 notify() 方法或者 notifyAll() 方法前，让当前线程等待。
      void notify()
        唤醒再次对象监视器上等待的单个线程。
        会继续执行wait方法之后的代码。

 */
public class Demo01WaitAndNotify {
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
                          obj.wait();
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

        // 创建一个老板的线程（生产者）
        new Thread() {
            @Override
            public void run() {
               while (true){
                   try {
                       Thread.sleep(5000);  // 花5秒钟做包子
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   // 保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                   synchronized (obj) {
                       System.out.println("老板5秒钟之后做好包子，告知顾客，可以吃包子了");
                       obj.notify();
                   }
               }
            }
        }.start();

    }
}
