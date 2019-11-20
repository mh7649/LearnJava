package com.runoob.singleton;

/**
 * 3、饿汉式
 * 避免反射机制破解单例模式
 */
public class HungryReflectionSingleton {

    private static HungryReflectionSingleton instance = new HungryReflectionSingleton();

    private HungryReflectionSingleton(){
        if (instance != null) {
            throw new RuntimeException("多次实例单例对象");
        }
    }

    public static HungryReflectionSingleton getInstance() {
        return instance;
    }

    public void sendMessage() {
        System.out.println("hungrySingleton");
    }
}
