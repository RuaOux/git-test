/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Exception;
/*
    异常的产生过程分析（分析异常怎么产生的，如何处理异常）
 */
public class Demo02Exception {
    public static void main(String[] args) {
        // 创建int类型的数组并赋值
        int[] arr = {1,2,3};
        int e = getElement(arr,3);
        System.out.println(e);
    }

    /*
        定义一个方法，获取数组指定索引处的元素
        参数：
            int[] arr
            int inedx
     */
    public static int getElement(int[] arr, int inedx) {
        int ele = arr[inedx];
        return ele;
    }

}
