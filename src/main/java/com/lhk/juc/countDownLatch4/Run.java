package com.lhk.juc.countDownLatch4;

import java.util.concurrent.CountDownLatch;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/5 11:01
 */
public class Run {
    public static void main(String[] args) {
        try {
            CountDownLatch comingTag=new CountDownLatch(10);
            CountDownLatch waitTag=new CountDownLatch(1);
            CountDownLatch waitRunTag=new CountDownLatch(10);
            CountDownLatch beginTag=new CountDownLatch(1);
            CountDownLatch endTag=new CountDownLatch(10);
            Mythread[] threadArray=new Mythread[10];
            for (int i=0;i<threadArray.length;i++){
                threadArray[i]=new Mythread(comingTag,waitTag,waitRunTag,beginTag,endTag);
                threadArray[i].start();
            }
            System.out.println("裁判等待选手的到来");
            comingTag.await();
            System.out.println("巡视5秒");
            Thread.sleep(5000);
            waitTag.countDown();
            System.out.println("各就各位");
            waitRunTag.await();
            Thread.sleep(2000);
            System.out.println("枪响");
            beginTag.countDown();
            endTag.await();
            System.out.println("所有运动员到达，统计名次");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
