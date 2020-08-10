package com.lhk.juc.threadPoolExecutor;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 9:36
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName()+"run"+System.currentTimeMillis());
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
//        ThreadPoolExecutor executor=new ThreadPoolExecutor(7,8,5,
//                TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        ThreadPoolExecutor executor=new ThreadPoolExecutor(7,8,0,
                TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
        executor.execute(runnable);//1
        executor.execute(runnable);//2
        executor.execute(runnable);//3
        executor.execute(runnable);//4
        executor.execute(runnable);//5
        executor.execute(runnable);//6
        executor.execute(runnable);//7
        executor.execute(runnable);//8
        Thread.sleep(300);
        System.out.println("A:"+executor.getCorePoolSize());//7
        System.out.println("A:"+executor.getPoolSize());//7
        System.out.println("A:"+executor.getQueue().size());//0
        Thread.sleep(10000);
        System.out.println("B:"+executor.getCorePoolSize());
        System.out.println("B:"+executor.getPoolSize());
        System.out.println("B:"+executor.getQueue().size());
    }
}
