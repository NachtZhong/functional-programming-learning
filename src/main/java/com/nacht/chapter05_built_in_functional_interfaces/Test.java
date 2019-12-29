package com.nacht.chapter05_built_in_functional_interfaces;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * java8中有许多内置的函数接口, 这些函数接口通过`@FunctionalInterface`注解来支持lambda表达式调用
 * Predicate接口适用于只有一个入参, 返回boolean值的函数, 这个接口包含许多default方法用于组合出复杂的逻辑判断(and, or等等)
 * Function接口接收一个入参, 并返回一个结果, 这个接口的default方法用于链式调用各种function
 * Supplier用于生产一个特定类型的实例, 不接受任何入参
 * Consumer接口接收一个入参, 不返回任何结果(消费者)
 * @author Nacht
 * Created on 2019/12/16
 */
public class Test {
    public static void main(String[] args) {
        //Predicate
        Predicate<String> endsWithA = s -> s.endsWith("A");
        Predicate<String> endsWithB = s -> s.endsWith("B");
        System.out.println(endsWithA.test("aA"));
        System.out.println(endsWithA.test("aB"));
        System.out.println(endsWithA.or(endsWithB).test("aB"));

        //Function
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> toUpperCaseAndAddHello = toUpperCase.andThen(s -> s + " Hello");
        System.out.println(toUpperCaseAndAddHello.apply("abcd")); //ABCD Hello

        //Supplier
        Supplier<Object> objectSupplier = Object::new;
        System.out.println(objectSupplier.get()); //java.lang.Object@16b98e56

        //Consumer
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("hello world"); //hello world

    }
}
