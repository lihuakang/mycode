package com.lhk.juc.countDownLatch5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/5 15:23
 */
public class MyService {
    private CountDownLatch count=new CountDownLatch(1);
    public void testMethod(){
        try {
            System.out.println(Thread.currentThread().getName()+"准备");
            count.await(3, TimeUnit.SECONDS);
            System.out.println(Thread.currentThread().getName()+"结束");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
