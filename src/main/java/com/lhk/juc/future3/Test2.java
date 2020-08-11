package com.lhk.juc.future3;

import java.util.concurrent.*;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 15:32
 */
public class Test2 {
    public static void main(String[] args) {
        MyCallable myCallable=new MyCallable();
        ExecutorService executorService=new ThreadPoolExecutor(5,Integer.MAX_VALUE,5,
                TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        Future<String> future=executorService.submit(myCallable);
        System.out.println(future.cancel(true)+" "+future.isCancelled());
    }
}
