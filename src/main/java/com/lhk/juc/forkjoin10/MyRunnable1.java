package com.lhk.juc.forkjoin10;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 16:14
 */
public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+" "+System.currentTimeMillis());
            Thread.sleep(4000);
            System.out.println(" end "+Thread.currentThread().getName()+" "+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
