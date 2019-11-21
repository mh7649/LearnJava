/*
 Copyright (c) 2002-2019 WiseCRM.com. All rights reserved.
 WiseCRM.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.mh.oom;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * 使用unsafe分配本机内存
 * VM Args:-Xms20M -XX:MaxDirectMemorySize=10M
 * @author laimh
 * @since 2019/11/21 21:42
 */
public class DirectMemoryOOM {

    private static final int _1MB = 1024 * 1024;
    private static int count;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            System.out.println(++count);
            unsafe.allocateMemory(_1MB);
        }
    }
}
