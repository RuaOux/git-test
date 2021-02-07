/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package VarArgs;
/*
    可变参数：是JDK1.5之后出现的新特性
    使用前提：
        当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
    使用格式：定义方法时使用
        修饰符 返回值类型  方法名 （数据类型 ...（...代表参数可以多个）变量名）()
    可变参数的原理：
        可变参数底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
        传递的参数个数，可以是0个（不传递）,1,2...多个
 */
public class Demo01VarArgs {
    public static void main(String[] args) {
        // int num = add(0);
//        System.out.println(num);
        int num = add(10);
        int num1 = add(10,20);
        System.out.println(num1);
    }
    /*
        定义计算(0-n)整数和的方法
        已知：数据类型已经确定int
        但是参数的个数不确定。不知道要计算几个整数的和,就可以使用可变参数
        add():  就会创建一个长度为0的数组， new int [0]
        add(10): 就会创建一个长度为1的数组， 存储传递过来的参数 new int[](10);
        add(10,20); 就会创建一个长度为2的数组， 存储传递过来的参数 new int[]{10,20}
        注意事项：
            1. 一个方法的参数列表，只能有一个可变参数
            2. 如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
     */

    public static int add(int...arr) {
        // 定义一个初始化的变量，让他记录累加求和
        int sum = 0;
        for (int i : arr) {
            System.out.println(i);
            sum += i;
        }
        return sum;
    }

    // 可变参数的特殊写法
    public static void method(Object...obj) {

    }

//    // 定义一个方法，计算两个int类型整数的合
//    public static int add(int a, int b , int c) {
//        return a + b + c;
//    }
}
