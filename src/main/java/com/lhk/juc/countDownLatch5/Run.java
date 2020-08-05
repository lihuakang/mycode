package com.lhk.juc.countDownLatch5;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/5 15:26
 */
public class Run {
    public static void main(String[] args) {
        MyService myService=new MyService();
        MyThread[] threadArray=new MyThread[3];
        for (int i=0;i<threadArray.length;i++){
            threadArray[i]=new MyThread(myService);
            threadArray[i].start();
        }
    }
}
