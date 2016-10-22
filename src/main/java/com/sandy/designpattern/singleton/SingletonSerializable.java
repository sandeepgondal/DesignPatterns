package com.sandy.designpattern.singleton;

import java.io.Serializable;

public class SingletonSerializable implements Serializable {

    static private SingletonSerializable INSTANCE = new SingletonSerializable();

    private SingletonSerializable() {
        System.out.println("Singleton instance created");
    }

    public static SingletonSerializable getInstance() {
        return INSTANCE;
    }

    protected Object readResolve() {
        return INSTANCE;
    }

}
