package com.lhk.juc.forkjoin9;

import java.util.concurrent.ForkJoinPool;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 16:00
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable1=new MyRunnable1();
        ForkJoinPool pool=new ForkJoinPool();
        pool.submit(myRunnable1);
        Thread.sleep(2000);
        pool.shutdownNow();
        System.out.println("main end");
        Thread.sleep(Integer.MAX_VALUE);
    }
}
