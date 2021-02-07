/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.sleep;
/*
    public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停（暂停停止执行）
    毫秒数结束之后，线程继续执行
 */
public class Demo01Sleep {
    public static void main(String[] args) {
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);

            // 使用Thread类的sleep方法让线程睡眠1秒钟
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
