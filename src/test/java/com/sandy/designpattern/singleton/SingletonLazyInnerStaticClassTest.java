package com.sandy.designpattern.singleton;

public class SingletonLazyInnerStaticClassTest {

    public static void main(String[] args) {
        SingletonLazyInnerStaticClass singletonLazyInnerStaticClass1 = SingletonLazyInnerStaticClass.getInstance();
        SingletonLazyInnerStaticClass singletonLazyInnerStaticClass2 = SingletonLazyInnerStaticClass.getInstance();
        SingletonLazyInnerStaticClass singletonLazyInnerStaticClass3 = SingletonLazyInnerStaticClass.getInstance();
    }

}
