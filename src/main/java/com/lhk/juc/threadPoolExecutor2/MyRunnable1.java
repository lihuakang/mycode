package com.lhk.juc.threadPoolExecutor2;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 10:03
 */
public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("begin"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
            Thread.sleep(4000);
            System.out.println(" end "+Thread.currentThread().getName()+" "+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
