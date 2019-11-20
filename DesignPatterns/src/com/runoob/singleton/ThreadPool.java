package com.runoob.singleton;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 参考trunk中的ThreadPool类。
 */
public final class ThreadPool {

    private static final ExecutorService EXEC = Executors.newCachedThreadPool();

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                super.run();
                EXEC.shutdownNow();
            }
        });
    }

    /**
     * 执行任务
     * @param task 任务线程
     */
    public static void exec(Runnable task) {
        EXEC.execute(task);
    }
}
