package com.lhk.juc.completionService;

import java.util.concurrent.*;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/12 12:15
 */
public class Run {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        CompletionService scRef=new ExecutorCompletionService(executorService);
        for (int i=0;i<1;i++){
            scRef.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(3000);
                    System.out.println("3秒过后");
                    return "lhk3秒";
                }
            });
        }
        for (int i=0;i<1;i++){
            System.out.println(scRef.poll());
        }
    }
}
