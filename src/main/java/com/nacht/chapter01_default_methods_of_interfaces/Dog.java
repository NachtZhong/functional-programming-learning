package com.nacht.chapter01_default_methods_of_interfaces;

/**
 * @author Nacht
 * Created on 2019/12/16
 */
public class Dog implements CanEat{
    @Override
    public void eat() {
        System.out.println("dog can eat");
    }
}
