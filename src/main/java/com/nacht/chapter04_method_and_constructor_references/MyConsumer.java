package com.nacht.chapter04_method_and_constructor_references;

/**
 *
 */
@FunctionalInterface
public interface MyConsumer<T>{
    void accept(T t);
}