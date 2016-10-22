package com.sandy.designpattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class SingletonLazyDoubleCheckTest {

    @Test
    public void shouldNotThrowExceptionIfReflectionNotUsed() throws Exception {
        SingletonLazyDoubleCheck.getInstance();
        SingletonLazyDoubleCheck.getInstance();
        SingletonLazyDoubleCheck.getInstance();
    }

    @Test
    public void shouldThrowExceptionIfReflectionUsedToCreateInstance() throws Exception {
        SingletonLazyDoubleCheck singletonLazyDoubleCheck1 = SingletonLazyDoubleCheck.getInstance();
        Constructor<SingletonLazyDoubleCheck> declaredConstructor = SingletonLazyDoubleCheck.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        String errorMessage = "";
        try {
            SingletonLazyDoubleCheck singletonLazyDoubleCheck2 = declaredConstructor.newInstance();
        } catch (Exception e) {
            errorMessage = e.getCause().getMessage();
        }
        Assert.assertEquals("Invalid Condition", errorMessage);
    }
}
