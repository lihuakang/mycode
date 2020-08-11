package com.lhk.juc.future1;

import java.util.concurrent.*;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 14:59
 */
public class Run {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try {
            MyCallable myCallable=new MyCallable(100);
            ThreadPoolExecutor executor=new ThreadPoolExecutor(2,3,5L,
                    TimeUnit.SECONDS,new LinkedBlockingDeque<>());
            Future<String> future=executor.submit(myCallable);
            System.out.println("main A"+System.currentTimeMillis());
            System.out.println(future.get());
            System.out.println("main B"+System.currentTimeMillis());
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }
}
