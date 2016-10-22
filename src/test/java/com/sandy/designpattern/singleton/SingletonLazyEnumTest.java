package com.sandy.designpattern.singleton;

public class SingletonLazyEnumTest {

    public static void main(String[] args) {
        System.out.println("Loading singleton class");
        SingletonLazyEnum instance = SingletonLazyEnum.INSTANCE;
        instance.printData();
    }

}
