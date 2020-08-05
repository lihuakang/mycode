package com.lhk.juc.semaphore2;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(1000);
        b.interrupt();
    }
}
