package com.lhk.juc.forkjoin10;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 16:15
 */
public class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
