package com.lhk.juc.threadPoolExecutor3;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 10:27
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable1=new MyRunnable1();
        ThreadPoolExecutor pool=new ThreadPoolExecutor(2,9999,9999L,
                TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        pool.execute(myRunnable1);
        pool.execute(myRunnable1);
        pool.execute(myRunnable1);
        pool.execute(myRunnable1);
        Thread.sleep(1000);
        pool.shutdownNow();
    }
}
