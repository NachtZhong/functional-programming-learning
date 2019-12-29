package com.nacht.chapter03_functional_interfaces;

/**
 * 在java8中, 每个lambda表达式都对应一个接口
 * 这个接口只能包含一个抽象方法, 每一个该接口对应的lambda表达式匿名函数都对应着这个抽象方法
 * 由于default修饰的方法有具体实现, 不是抽象方法, 可以在函数接口中添加default方法
 * 为了保证函数接口符合编译器要求的规范, 可以通过添加@FunctionalInterface注解在接口上来强制指明该接口是一个函数接口
 * 这样当往函数接口添加第二个抽象方法的时候编译器会给出错误警告
 * @author Nacht
 * Created on 2019/12/16
 */
public class Test {
    public static void main(String[] args) {
        int x = 9;
        int y = 3;
        System.out.println("x + y : " + Test.operation(x, y, ((a, b) -> a + b)));
        System.out.println("x - y : " + Test.operation(x, y, ((a, b) -> a - b)));
        System.out.println("x * y : " + Test.operation(x, y, ((a, b) -> a * b)));
        System.out.println("x / y : " + Test.operation(x, y, ((a, b) -> a / b)));
    }

    /**
     * defines a method which can use anonymous function as a param
     * @param x
     * @param y
     * @param mathOperation
     * @return
     */
    public static int operation(int x, int y, MathOperation mathOperation) {
        return mathOperation.operation(x, y);
    }
}
