package com.lhk.juc.semaphore5;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/3 17:30
 */
public class Run {
    public static void main(String[] args) {
        ListPool listPool=new ListPool();
        MyThread[] threadArray=new MyThread[12];
        for (int i=0;i<threadArray.length;i++){
            threadArray[i]=new MyThread(listPool);
        }
        for (int i=0;i<threadArray.length;i++){
            threadArray[i].start();
        }
    }
}
