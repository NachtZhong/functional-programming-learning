package com.nacht.chapter04_method_and_constructor_references;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * java8提供了双冒号::这个语法糖来获取方法的引用
 * 比如下面代码中的System.out::println相当于取得了System.out.println的方法引用
 * 由于MyConsumer中定义的抽象方法accept类型和System.out.println一样
 * MyConsumer<Object> myprint = System.out::println;
 * 所以可以通过上面这句代码把System.out.println的方法引用赋值给myprint, 相当于myprint.accept(Object o) = System.out.println(Object o)
 * 所以直接调用myprint.accept即可实现打印
 * 实际java内置了Consumer接口来指定这种接受参数却不返回值的void类型方法, 可以省去我们自己定义函数接口的工作
 * 如下面代码所示
 * @author Nacht
 * Created on 2019/12/16
 */
public class Test {
    public static void main(String[] args) {
        MyConsumer<Object> myprint = System.out::println;
        myprint.accept("you");
        //using java built-in functional interface
        Consumer<Object> myPrintln = System.out::println;
        myPrintln.accept("print by my println");
    }
}
