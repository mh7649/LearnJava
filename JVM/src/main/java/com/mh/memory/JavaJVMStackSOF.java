/*
 Copyright (c) 2002-2019 WiseCRM.com. All rights reserved.
 WiseCRM.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.mh.memory;

/**
 * ()
 * VM Args:
 * -Xss128k 设置本地方法栈大小
 * @author laimh
 * @since 2019/11/18 21:34
 */
public class JavaJVMStackSOF {

    private int leakLength;

    private void stackLeak() {
        leakLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaJVMStackSOF javaJVMStackSOF = new JavaJVMStackSOF();
        try {
            javaJVMStackSOF.stackLeak();
        } catch (Throwable throwable) {
            System.out.println("leakLength:" + javaJVMStackSOF.leakLength);
            throw throwable;
        }
    }
}
