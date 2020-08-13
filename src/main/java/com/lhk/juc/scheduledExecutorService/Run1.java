package com.lhk.juc.scheduledExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/13 16:32
 */
public class Run1 {
    public static void main(String[] args) {
        try {
            List<Callable> callableList=new ArrayList<>();
            callableList.add(new MyCallableA());
            callableList.add(new MyCallableB());
            ScheduledExecutorService executor= Executors.newScheduledThreadPool(2);
            ScheduledFuture<String> futureA=executor.schedule(callableList.get(0),4L, TimeUnit.SECONDS);
            ScheduledFuture<String> futureB=executor.schedule(callableList.get(1),4L, TimeUnit.SECONDS);
            System.out.println("   X="+System.currentTimeMillis());
            System.out.println("返回值A:"+futureA.get());
            System.out.println("返回值B:"+futureB.get());
            System.out.println("   Y="+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
