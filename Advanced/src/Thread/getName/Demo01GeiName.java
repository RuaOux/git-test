/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.getName;

public class Demo01GeiName {
    public static void main(String[] args) {
        // 创建Thread类的子类对象
        MyThread mt = new MyThread();
        // 调用start方法，开启新线程方法，执行run方法
        mt.start();

        new MyThread().start();
        new MyThread().start();
    }
}
