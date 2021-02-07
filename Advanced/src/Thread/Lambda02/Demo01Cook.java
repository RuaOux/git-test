/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Thread.Lambda02;

public class Demo01Cook {
    public static void main(String[] args) {
        // 调用invokeCook方法，参数是cook接口，传递Cook接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        // 使用Lambda表达式，简化内部类书写
        invokeCook(() -> {
            System.out.println("吃饭了");
        });
    }

    // 定义一个方法 参数传递Cook接口，方法内部调用Cook接口中的makeFood
    public static void invokeCook (Cook cook) {
        cook.makeFood();
    }
}
