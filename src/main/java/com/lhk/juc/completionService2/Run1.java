package com.lhk.juc.completionService2;

import java.util.concurrent.*;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/12 12:47
 */
public class Run1 {
    public static void main(String[] args) {
        try {
            Userinfo userinfo=new Userinfo();
            MyRunnable myRunnable=new MyRunnable(userinfo);
            Executor executor= Executors.newCachedThreadPool();
            CompletionService csRef=new ExecutorCompletionService(executor);
            Future<Userinfo> future=csRef.submit(myRunnable,userinfo);
            System.out.println(future.get().getUsername()+" "+future.get().getPassword());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
