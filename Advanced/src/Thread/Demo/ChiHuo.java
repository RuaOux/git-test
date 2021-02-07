/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.Demo;

public class ChiHuo extends Thread{
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        // 使用死循环让吃货一直吃包子
        while (true) {
            // 必须保证同步所以需要同步技术
            synchronized (bz) {
                // 对包子的状态进行判断
                if (bz.flag = false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 被唤醒之后执行的代码。吃包子
                System.out.println("吃货正在吃:" + bz.pi + bz.xian + "的包子");
                // 吃完后需要把包子的状态修改
                bz.flag = false;
                // 唤醒包子铺让他生产包子
                bz.notify();

                System.out.println("吃货已经把:" + bz.pi + bz.xian + "的包子,包子铺开始生产包子");
                System.out.println("===============");
                // 吃货吃完之后就需要继续等待 等包子铺生产完包子唤醒他
                try {
                    bz.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
