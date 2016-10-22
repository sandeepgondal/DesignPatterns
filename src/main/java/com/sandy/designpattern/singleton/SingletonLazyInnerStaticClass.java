package com.sandy.designpattern.singleton;

public class SingletonLazyInnerStaticClass {

    static {
        System.out.println("Singleton class loaded");
    }

    private SingletonLazyInnerStaticClass() {
        System.out.println("Singleton instance created");

    }

    public static SingletonLazyInnerStaticClass getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private final static SingletonLazyInnerStaticClass INSTANCE = new SingletonLazyInnerStaticClass();

        static {
            System.out.println("Static holder class loaded");
        }
    }

}
