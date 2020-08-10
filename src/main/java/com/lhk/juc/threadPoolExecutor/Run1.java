package com.lhk.juc.threadPoolExecutor;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 9:29
 */
public class Run1 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(7,8,5,
                TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        System.out.println(executor.getCorePoolSize());
        System.out.println(executor.getMaximumPoolSize());
        System.out.println("");
        executor=new ThreadPoolExecutor(7,8,5
        ,TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
        System.out.println(executor.getCorePoolSize());
        System.out.println(executor.getMaximumPoolSize());
    }
}
