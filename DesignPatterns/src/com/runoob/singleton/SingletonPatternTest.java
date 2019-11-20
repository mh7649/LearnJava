package com.runoob.singleton;

import java.util.HashSet;
import java.util.Set;

public class SingletonPatternTest {
    public static final String HUNGRYSINGLETON = "HungrySingleton";
    public static final String LAZYNOTHREADSECURE = "LazyNoThreadSecure";

    public static String nowSingletonName;

    public static Set<Object> objectSet = new HashSet<>(20);

    public void testLazyNoThreadSecure() {

    }

    public static void testMoreThread() {
        for (int i = 0; i < 100; i++) {
            ThreadPool.exec(() -> {
                LazyNoThreadSecure.getInstance().getMessage();
            });
        }
        System.out.println("com/runoob/singleton/SingletonPatternTest.java:21.." + objectSet.size());
    }
}
