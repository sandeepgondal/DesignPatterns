package com.sandy.designpattern.singleton;

public class SingletonLazyDoubleCheck {

    private static volatile SingletonLazyDoubleCheck INSTANCE;

    private SingletonLazyDoubleCheck() {
        System.out.println("Singleton instance created");
        if (INSTANCE != null)
            throw new RuntimeException("Invalid Condition");
    }

    public static SingletonLazyDoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonLazyDoubleCheck.class) {
                if (INSTANCE == null)
                    INSTANCE = new SingletonLazyDoubleCheck();
            }
        }
        return INSTANCE;
    }
}
