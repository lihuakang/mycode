package com.lhk.juc.countDownLatch3;

import java.util.concurrent.CountDownLatch;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/4 17:49
 */
public class MyService {
    private CountDownLatch countDownLatch=new CountDownLatch(2);
    public void testMethod(){
        try {
            System.out.println(Thread.currentThread().getName()+"准备");
            countDownLatch.await();
            System.out.println(Thread.currentThread().getName()+"结束");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void downMethod(){
        System.out.println("开始");
        countDownLatch.countDown();
    }
}
