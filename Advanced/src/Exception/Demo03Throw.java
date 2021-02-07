/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Exception;
/*
    throw关键字
        作用：
            可以使用throw关键字在指定的方法中抛出指定的异常
        使用格式：
            throw new xxxException("异常产生的原因");
        注意事项：
            1. throw关键字必须写在方法的内部
            2. throw关键字后边new的对象必须是Exception后者Exception的子类对象
            3. throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
                throw关键字后边创建的是RuntimeException或者是 RuntimeException的子类对象，
                我们可以不处理，默认交给JVM（打印异常、中断程序）
                throw关键字后边创建的是编译异常（写代码的时候报错），
                我们必须处理这个异常，要么throw要么try...catch
 */
public class Demo03Throw {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int e = getElement(arr,3);
        System.out.println(e);
    }
    /*
    定义一个方法，获取数组指定索引处的元素
    参数：
        int[] arr
        int inedx
        以后在工作中，我们首先必须对方法传递过来的参数进行合法性验证
        如果参数不合法，那么我们就必须使用抛出异常的方法，告知方法的调用者，传递的参数有问题
        注意：
            NullPointerException是一个运行期异常，我们不用处理，默认交给JVM处理
 */
    public static int getElement(int[] arr, int index) {
        /*
            我们可以对传递过来的参数数组，进行合法性验证
            如果数组arr的值是null
            我们就抛出空指针异常，告知方法的调用者“传递的数组的值是null”
         */
        if (arr == null) {
           throw new NullPointerException("传递的数组的值是null") ;
        }
        /*
            我们可以对传递过来的参数index进行合法性验证
            如果index的范围不在数组索引范围内
            那么我们就抛出数组索引越界异常，告知方法的调用者"传递的索引超出了数组的范围"
         */
        if (index < 0 || index > arr.length-1) {
            throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的范围");
        }

        int ele = arr[index];
        return ele;
    }
}
