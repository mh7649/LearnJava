/*
 Copyright (c) 2002-2019 WiseCRM.com. All rights reserved.
 WiseCRM.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.mh.refuse;

import org.junit.Test;

/**
 *  3-5 新生代 Minor GC
 *  VM参数：-verbose:gc -Xms20M -Xmx=20M -Xmn=10M
 *  -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * @author laimh
 * @since 2019/11/25 22:32
 */
public class MinorGC {

    public static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        testMinorGC();
    }

    public static void testMinorGC() {
        byte[] application1, application2, application3, application4;
        application1 = new byte[2 * _1MB];
        application2 = new byte[2 * _1MB];
        application3 = new byte[2 * _1MB];
        application4 = new byte[4 * _1MB];
//        放开注释会导致内存溢出
//        application4 = new byte[4 * _1MB];
//        application4 = new byte[4 * _1MB];
//        application4 = new byte[4 * _1MB];
    }

    /**
     *  3-6 大对象直接进入老年代
     *
     *  VM参数：
     *  -verbose:gc -Xms20M -Xmx=20M -Xmn=10M
     *  -XX:+PrintGCDetails -XX:SurvivorRatio=8
     *  -XX:PretenureSizeThreshold=3145728
     */
    @Test
    public void testPretenureSizeThreshold() {
        byte[] application;
        application = new byte[4 * _1MB];
    }
}
