package com.lhk.juc.future1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 15:07
 */
public class Run2 {
    public static void main(String[] args) {
        try {
            Runnable runnable=new Runnable() {
                @Override
                public void run() {
                    System.out.println("打印的信息");
                }
            };
            ExecutorService executorService= Executors.newCachedThreadPool();
            Future future=executorService.submit(runnable);
            System.out.println(future.get()+""+future.isDone());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
