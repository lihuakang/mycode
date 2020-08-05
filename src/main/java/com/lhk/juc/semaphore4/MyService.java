package com.lhk.juc.semaphore4;

import java.util.concurrent.Semaphore;

public class MyService {
    private Semaphore semaphore=new Semaphore(1,false);
    public void testMethod(){
        try {
            semaphore.acquire();
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"=======");
            System.out.println("大约还有"+semaphore.getQueueLength()+"个线程等待");
            System.out.println("是否还有线程在等待信号量呢"+semaphore.hasQueuedThreads());
        }catch (Exception e){
            e.fillInStackTrace();
        }finally {
            semaphore.release();
        }
    }
}
