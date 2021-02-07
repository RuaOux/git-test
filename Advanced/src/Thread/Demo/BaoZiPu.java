/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.Demo;
/*
    生产者（包子铺）是一个线程类、可以继承Thread
    设置线程任务：生产包子
    对包子的状态进行判断
        true:
            包子铺调用wait方法进入等待状态
        flase:
            包子铺生产包子
            交替生产两种包子
                有两种状态（i%2==0)
            包子铺生产好了包子
                修改包子的状态为true；
                唤醒吃货线程，让吃货线程吃包子

    注意：
        包子铺线程和包子线程关系-->通信（互斥）
        必须使用同步技术保证俩个线程只能有一个在执行
        锁对象必须保证唯一，可以使用包子对象作为锁对象
        包子铺类和吃货的类就需要把包子对象作为参数传递进来
            1. 需要在成员位置创建一个包子变量
            2. 使用带参数构造方法为包子变量赋值
 */
public class BaoZiPu extends Thread{
    // 1. 需要在成员位置创建一个包子变量
    private BaoZi bz;

    // 2. 使用带参数构造方法为包子变量赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;

       while (true) {

           //  包子铺线程和包子线程关系-->通信（互斥）
           //  必须使用同步技术保证俩个线程只能有一个在执行
           synchronized (bz) {
               // 对包子的状态进行判断
               if (bz.flag == true) {
                   try {
                       bz.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }

               if (count % 2 == 0) {
                   // 生产薄皮三鲜馅包子
                   bz.pi = "薄皮";
                   bz.xian = "三鲜馅";
               } else {
                   // 生产 生肉包
                   bz.pi = "薄皮";
                   bz.xian = "生肉包馅";
               }
               count++;

               System.out.println("包子铺正在生产：" + bz.pi + bz.xian + "包子");
               // 生产包子需要3秒钟
               try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               bz.flag = true;
               // 唤醒吃货线程 让他吃包子
               bz.notify();
               System.out.println("包子已经生产好了:" + bz.pi + bz.xian + "包子，吃货可以开始吃了");

       }
        }
    }
}
