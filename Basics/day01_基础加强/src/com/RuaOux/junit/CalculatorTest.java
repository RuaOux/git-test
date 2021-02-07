package com.RuaOux.junit;

public class CalculatorTest {
    public static void main(String[] args) {
        // 创建对象
        Calculator c = new Calculator();
        // 调用
        int add = c.add(1, 2);
        System.out.println(add);
        int sub = c.sub(3, 1);
        System.out.println(sub);
    }
}
