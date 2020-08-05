package com.lhk.juc.countDownLatch3;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/4 17:52
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService=new MyService();
        MyThread[] myThreads=new MyThread[10];
        for (int i=0;i<myThreads.length;i++){
            myThreads[i]=new MyThread(myService);
            myThreads[i].setName("线程"+i);
            myThreads[i].start();
        }
        Thread.sleep(2000);
        myService.downMethod();
        myService.downMethod();

    }
}
