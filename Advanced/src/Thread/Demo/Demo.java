/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.Demo;

public class Demo {
    public static void main(String[] args) {
        // 包子对象
        BaoZi bz = new BaoZi();
        // 包子铺线程 包子铺，生产包子
        new BaoZiPu(bz).start();
        // 吃货线程 开启，吃包子
        new ChiHuo(bz).start();
    }
}
