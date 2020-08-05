package com.lhk.juc.semaphore3;

import java.util.concurrent.Semaphore;

public class MyService {
    private Semaphore semaphore=new Semaphore(10);
    public void testMethod(){
        try {
            semaphore.acquire();
            System.out.println(semaphore.availablePermits());//获取当前的许可数
            System.out.println(semaphore.availablePermits()+" "+semaphore.drainPermits());//获取当前许可数，并将许可数清零
            System.out.println(semaphore.availablePermits());
        }catch (Exception e){
            e.fillInStackTrace();
        }finally {
            semaphore.release();
        }
    }
}
