/*
 Copyright (c) 2002-2019 WiseCRM.com. All rights reserved.
 WiseCRM.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.mh.memory;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 *jdk1.7
 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 *jdk1.8及以上
 * -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m
 * @author laimh
 * @since 2019/11/20 22:13
 */
public class JavaMethodAreaOOM {

    private static int excuteCount;

    public static void main(String[] args) {
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invokeSuper(o, objects);
                }
            });
            enhancer.create();
            System.out.println("excuteCount:" + ++excuteCount);
        }
    }

    static class OOMObject {

    }
}
