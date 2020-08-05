package com.lhk.juc.semaphore;

/**
 * 中断Semaphore
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(1000);
        b.interrupt();//中断线程B
        System.out.println("main中断了b");
    }
}
