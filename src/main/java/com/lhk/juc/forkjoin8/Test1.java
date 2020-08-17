package com.lhk.juc.forkjoin8;

import java.util.concurrent.ForkJoinPool;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 15:35
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable1=new MyRunnable1();
        ForkJoinPool pool=new ForkJoinPool();
        pool.submit(myRunnable1);
        Thread.sleep(1000);
        pool.shutdown();
        pool.submit(myRunnable1);
        System.out.println("main end");
        Thread.sleep(Integer.MAX_VALUE);
    }
}
