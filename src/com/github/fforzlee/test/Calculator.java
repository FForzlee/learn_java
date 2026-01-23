package com.github.fforzlee.test;

public class Calculator {
    // 测试 Git 的修改和差异对比
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(10, 5);
        System.out.println("Result is: " + result);
    }
}