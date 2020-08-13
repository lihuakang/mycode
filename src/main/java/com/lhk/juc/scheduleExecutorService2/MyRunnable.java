package com.lhk.juc.scheduleExecutorService2;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/13 16:42
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("begin ="+System.currentTimeMillis()+"ThreadName"+Thread.currentThread().getName());
            Thread.sleep(4000);
            System.out.println("end ="+System.currentTimeMillis()+"ThreadName"+Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
