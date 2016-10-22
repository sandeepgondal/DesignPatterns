package com.sandy.designpattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonSerializableTest {

    @Test
    public void shouldReturnSameInstanceForMultipleInvocationOfGetInstanceMethod() throws Exception {
        SingletonSerializable singletonSerializable1 = SingletonSerializable.getInstance();
        SingletonSerializable singletonSerializable2 = SingletonSerializable.getInstance();
        Assert.assertEquals(singletonSerializable1, singletonSerializable2);
    }

    @Test
    public void serializationDeserializationShouldNotCreateTwoInstance() throws Exception {
        SingletonSerializable singletonSerializable1 = SingletonSerializable.getInstance();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("temp.txt"));
        objectOutputStream.writeObject(singletonSerializable1);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("temp.txt"));
        SingletonSerializable singletonSerializable2 = (SingletonSerializable) objectInputStream.readObject();

        Assert.assertEquals(singletonSerializable1, singletonSerializable2);
    }
}
