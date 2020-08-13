package com.lhk.juc.scheduleExecutorService2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/13 16:43
 */
public class Run {
    public static void main(String[] args) {
        ScheduledExecutorService executor= Executors.newSingleThreadScheduledExecutor();
        System.out.println("  X="+System.currentTimeMillis());
        //从第10秒开始运行，每隔两秒执行一次
        executor.scheduleAtFixedRate(new MyRunnable(),10,2, TimeUnit.SECONDS);
        System.out.println("  Y="+System.currentTimeMillis());
    }
}
