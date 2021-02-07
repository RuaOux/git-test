package com.RuaOux.demo05.StaticMethodReference;
/*
    通过类名引用静态成员方法
    类已经存在，静态成员方法也已经存在
    就可以通过类名直接引用静态方法
 */
public class Demo01StaticMethodReference {
    // 定义一个方法，方法传递Calcable接口
    public static int getNum(int number,Calcable c){
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
        // 调用method方法传递计算绝对值的整数和Lambda表达式
        int num = getNum(-10, (n) -> {
            // 对参数进行绝对值的计算并返回结果
            return Math.abs(n);
        });
        System.out.println(num);

        /*
            使用方法引用优化Lambda
         */
        int num1 = getNum(-10, Math::abs);
        System.out.println(num1);
    }
}
