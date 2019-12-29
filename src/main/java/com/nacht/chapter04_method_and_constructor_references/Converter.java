package com.nacht.chapter04_method_and_constructor_references;

/**
 * @author Nacht
 * Created on 2019/12/16
 */
@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);
}
