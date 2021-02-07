/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Exception;

import java.util.List;

public class Demo08Exception {
    public static void main(String[] args) {
        /*
            多个异常使用捕获又该如何处理？
            1. 多个异常分别处理
            2. 多个异常一次捕获，多次处理
            3. 多个异常一次捕获一次处理。
         */
        // 1. 多个异常分别处理
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]); // ArrayIndexOutOfBoundsException 3
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));  // ArrayIndexOutOfBoundsException: Index 3
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("后续代码");
        System.out.println("-----------------------------");
        // 2. 多个异常一次捕获，多次处理
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        /*
            一个try多个catch注意事项：
                catch里边定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上面，否则就会报错
        try中可能会产生的异常对象：（如果父类写在上面就会造成多态写法从而导致下面的catch子类无法被使用）
            new ArrayIndexOutOfBoundsException("3");
            new IndexOutOfBoundsException("3");
        try中如果产生了异常对象，会把异常对象抛出给catch处理
        抛出的异常对象，会从上到下依次赋值给catch中定义的异常变量
        ArrayIndexOutOfBoundsException e  =  new ArrayIndexOutOfBoundsException("3");
        IndexOutOfBoundsException e    =  new IndexOutOfBoundsException("3");
         */

        // 3. 多个异常一次捕获一次处理。
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));
        } catch (Exception e) {
            System.out.println(e);
        }
        // 运行时异常被抛出可以不处理，即不捕获也不声明抛出。
        // 默认给虚拟机处理，终止程序，什么时候不抛出运行时异常，在来继续执行程序

            int[] arr = {1,2,3};
            System.out.println(arr[3]); // ArrayIndexOutOfBoundsException 3
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));
    }
}
