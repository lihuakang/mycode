package com.lhk.juc.semaphore;

import java.util.concurrent.Semaphore;

public class Service {
    private Semaphore semaphore=new Semaphore(2);//同一时间做多允许一个线程执行
    public void testMethod(){
        try {
            semaphore.acquire();// 使用掉一个许可，减法
            System.out.println(Thread.currentThread().getName()+"begin timer="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+"end timer"+System.currentTimeMillis());
            semaphore.release();//创建一个许可
        }catch (Exception e){
            System.out.println("线程"+Thread.currentThread().getName()+"进入了catch");
            e.fillInStackTrace();
        }

    }
}
