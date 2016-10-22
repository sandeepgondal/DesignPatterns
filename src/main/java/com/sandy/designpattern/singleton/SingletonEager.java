package com.sandy.designpattern.singleton;

public class SingletonEager {

    static private SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {
        System.out.println("Singleton instance created");
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }

}
