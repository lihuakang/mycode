package com.lhk.juc.future3;

import java.util.concurrent.*;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 15:25
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable callable=new MyCallable();
        ExecutorService executorService=new ThreadPoolExecutor(50,Integer.MAX_VALUE,5
        , TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        Future<String> future=executorService.submit(callable);
        System.out.println(future.get());
        System.out.println(future.cancel(true)+" "+future.isCancelled());
    }
}
