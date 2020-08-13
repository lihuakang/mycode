package com.lhk.juc.scheduledExecutorService;

import java.util.concurrent.Callable;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/13 16:23
 */
public class MyCallableB implements Callable<String> {
    @Override
    public String call() throws Exception {
        try {
            System.out.println("CallB begin"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("CallB end"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
        return "return B";
    }
}
