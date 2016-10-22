package com.sandy.designpattern.singleton;

public class SingletonEagerTest {

    public static void main(String[] args) {
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        SingletonEager singletonEager3 = SingletonEager.getInstance();
    }

}
