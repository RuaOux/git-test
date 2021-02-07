/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.Therad;
/*
    1. 创建一个Thread类的子类
 */
public class MyThread extends Thread{
    // 2. 在Thread类的子类中重写Thread类中的方法，设置线程任务（开启线程要做什么）
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("run" + i);
        }
    }
}
