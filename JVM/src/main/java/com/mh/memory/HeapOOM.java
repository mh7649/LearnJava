/*
 Copyright (c) 2002-2019 WiseCRM.com. All rights reserved.
 WiseCRM.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.mh.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * 设置堆大小为20m，不可扩展（最大与最小相同）
 * -XX:+HeapDumpOnOutOfMemoryError 保存当前的内存堆转楚快照
 *
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=D:\testDumpDirectory
 * @author laimh
 * @since 2019/11/18 21:11
 */
public class HeapOOM {

    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
