package com.lhk.juc.semaphore6;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/4 10:18
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        RepastService service=new RepastService();
        ThreadP[] arrayP=new ThreadP[60];
        ThreadC[] arrayC=new ThreadC[60];
        for (int i=0;i<60;i++){
            arrayP[i]=new ThreadP(service);
            arrayC[i]=new ThreadC(service);
        }
        Thread.sleep(2000);
        for (int i=0;i<60;i++){
            arrayP[i].start();
            arrayC[i].start();
        }
    }
}
