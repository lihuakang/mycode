package com.lhk.juc.semaphore4;

public class Run {
    public static void main(String[] args) {
        MyService myService=new MyService();
        MyThread firstThread=new MyThread(myService);
        firstThread.start();
        MyThread[] threadArray=new MyThread[4];
        for (int i=0;i<threadArray.length;i++){
            threadArray[i]=new MyThread(myService);
            threadArray[i].start();
        }
    }
}
