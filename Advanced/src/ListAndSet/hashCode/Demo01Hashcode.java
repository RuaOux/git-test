/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ListAndSet.hashCode;
/*
    哈希值： 是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来得到地址，
    不是数据实际存储的地址）；
    在Object类有一个方法，可以获取对象的哈希值。
    hashCode方法的源码：
        public native int hashCode();
        native: 代表该方法调用的是本地操作系统的方法
 */
public class Demo01Hashcode {
    public static void main(String[] args) {
        // Preson类继承了Object类，所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);

        System.out.println(p1);
        /*
            String类的哈希值
                String类重写了hashCode方法
         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
