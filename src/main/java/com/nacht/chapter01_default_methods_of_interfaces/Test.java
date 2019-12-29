package com.nacht.chapter01_default_methods_of_interfaces;

/**
 * java8允许通过default关键字来为接口添加方法的默认实现
 * 当某个方法有默认实现的时候, 实现该接口的类可以选择是否重写该方法
 * 如果不重写, 调用该方法时将调用在接口中定义的默认方法
 * @author Nacht
 * Created on 2019/12/16
 */
public class Test {
    public static void main(String[] args) {
        CanEat dog = new Dog();
        CanEat cat = new Cat();
        dog.eat();
        cat.eat();
    }
}
