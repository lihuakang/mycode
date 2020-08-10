package com.lhk.juc.threadPoolExecutor2;

import sun.nio.ch.ThreadPool;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 10:19
 */
public class Test3 {
    public static void main(String[] args) {
        MyRunnable1 myRunnable1=new MyRunnable1();
        ThreadPoolExecutor executor=new ThreadPoolExecutor(7,10,0L, TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>());
        executor.execute(myRunnable1);
        executor.shutdown();
        System.out.println("main end");
    }
}
