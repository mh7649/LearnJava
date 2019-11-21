/*
 Copyright (c) 2002-2019 WiseCRM.com. All rights reserved.
 WiseCRM.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.mh.refuse;

import javax.print.attribute.standard.NumberUp;

/**
 * 3-2：一次对象自我拯救的演示
 * 演示了两点：
 * 1、对象可以在被GC时自我拯救
 * 2、这种自救机会只有一次，因为一个对象的finalize()方法最多被系统自动调用一次
 *
 * @author laimh
 * @since 2019/11/21 22:03
 */
public class FinalizeEscapeGC {

    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive() {
        System.out.println("Yes, I'm still alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new FinalizeEscapeGC();
        SAVE_HOOK = null;
        // 对象第一次成功拯救自己
        System.gc();
        /*
            finalize()方法优先级很低，所以需要暂停0.5秒
         */
        Thread.sleep(500);
        if (SAVE_HOOK == null) {
            System.out.println("No, I'm death");
        } else {
            SAVE_HOOK.isAlive();
        }

        // 第二次， 自救失败
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK == null) {
            System.out.println("No, I'm death");
        } else {
            SAVE_HOOK.isAlive();
        }
    }
}
