/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.Lambda04;

public class Demo01Calculator {
    public static void main(String[] args) {
        invokeCalc(20, 50, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        // 使用Lambda表达式简化匿名内部类的书写
        invokeCalc(40,50,(int a,int b) -> {
            return a + b;
        });

}
    public static void invokeCalc (int a, int b, Calculator c) {
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
