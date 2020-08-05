package com.lhk.juc.countDownLatch1;

import java.util.concurrent.CountDownLatch;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/4 17:23
 */
public class MyService {
    private CountDownLatch down=new CountDownLatch(1);
    public void testMethod(){
        try {
            System.out.println("A");
            down.await();//不为0则阻塞
            System.out.println("B");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void downMethod(){
        System.out.println("X");
        down.countDown();//减一
    }
}
