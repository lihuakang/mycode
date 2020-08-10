package com.lhk.juc.threadPoolExecutor4;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 10:42
 */
public class Test1 {
    public static void main(String[] args) {
        MyRunnable1 myRunnable1=new MyRunnable1();
        ThreadPoolExecutor pool=new ThreadPoolExecutor(2,9999,9999L,
                TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>(),new MyThreadFactoryA());
        pool.execute(myRunnable1);
    }
}
