package com.lhk.juc.future4;

import java.util.concurrent.*;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 15:39
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyCallable myCallable=new MyCallable();
        ExecutorService executorService=new ThreadPoolExecutor(5,Integer.MAX_VALUE,5,
                TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        Future<String> future=executorService.submit(myCallable);
        Thread.sleep(4000);
        System.out.println(future.cancel(true)+"zzzzzzzzzzzzzzzzzzzzzzzzzzz"+future.isCancelled());
    }
}
