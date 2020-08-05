package com.lhk.juc.semaphore2;

import java.util.concurrent.Semaphore;

/**
 * 方法acquireUninterruptibly()的作用是使等待进入acquire()方法的线程，不允许被中断。
 */
public class Service {
    private Semaphore semaphore=new Semaphore(1);
    public void testMethod(){
        semaphore.acquireUninterruptibly();// 不可中断
        System.out.println(Thread.currentThread().getName()+"begin timer="+System.currentTimeMillis());
        for (int i=0;i<Integer.MAX_VALUE/50;i++){
            String newString =new String();
            Math.random();
        }
        System.out.println(Thread.currentThread().getName()+"end timer="+System.currentTimeMillis());
        semaphore.release();
    }
}
