package com.runoob.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 3、饿汉式
 * 避免反序列化机制破解单例模式
 */
public class HungrySerializableSingleton implements Serializable {

    private static HungrySerializableSingleton instance = new HungrySerializableSingleton();

    private HungrySerializableSingleton(){}

    public static HungrySerializableSingleton getInstance() {
        return instance;
    }

    public void sendMessage() {
        System.out.println("hungrySingleton");
    }

    private static Object readObject() throws ObjectStreamException {
        return instance;
    }
}
