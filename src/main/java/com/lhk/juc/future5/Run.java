package com.lhk.juc.future5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/12 10:55
 */
public class Run {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        ThreadPoolExecutor executor= (ThreadPoolExecutor) executorService;
        executor.setRejectedExecutionHandler(new MyRejectedExecutionHandler());
        executorService.submit(new MyRunnable("A"));
        executorService.submit(new MyRunnable("B"));
        executorService.submit(new MyRunnable("C"));
        executor.shutdown();
        executorService.submit(new MyRunnable("D"));
    }
}
