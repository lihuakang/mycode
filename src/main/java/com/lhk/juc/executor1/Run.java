package com.lhk.juc.executor1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/7 10:46
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newCachedThreadPool();
        for (int i=0;i<10;i++) {
            executorService.execute(new MyRunnable("" + (i + 1)));
        }
        Thread.sleep(1000);
        System.out.println();
        System.out.println();
        for (int i=0;i<10;i++) {
            executorService.execute(new MyRunnable("" + (i + 1)));
        }
    }
}
