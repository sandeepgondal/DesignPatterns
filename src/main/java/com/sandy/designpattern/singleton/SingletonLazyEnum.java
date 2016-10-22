package com.sandy.designpattern.singleton;

public enum SingletonLazyEnum {

    INSTANCE;

    SingletonLazyEnum() {
        System.out.println("Singletong instance created");
    }

    private int data = 100;

    public void printData() {
        System.out.println("Data is : " + data);
    }

}
