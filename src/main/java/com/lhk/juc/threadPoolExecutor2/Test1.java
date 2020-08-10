package com.lhk.juc.threadPoolExecutor2;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 10:04
 */
public class Test1 {
    public static void main(String[] args) {
        MyRunnable1 myRunnable=new MyRunnable1();
        ThreadPoolExecutor pool=new ThreadPoolExecutor(7,10,0L, TimeUnit.SECONDS
        ,new LinkedBlockingDeque<Runnable>());
        pool.execute(myRunnable);
        System.out.println("mian end");
    }
}
