package com.lhk.juc.forkjoin7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/14 15:28
 */
public class Test {
    public static void main(String[] args) {
        try {
            List list=new ArrayList<>();
            list.add(new MyCallable(5000));
            list.add(new MyCallable(4000));
            list.add(new MyCallable(3000));
            list.add(new MyCallable(2000));
            list.add(new MyCallable(1000));
            ForkJoinPool pool=new ForkJoinPool();
            List<Future<String>> listFuture=pool.invokeAll(list);//阻塞
            for (int i=0;i<listFuture.size();i++){
                System.out.println(listFuture.get(i).get()+" nowTime"+System.currentTimeMillis());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
