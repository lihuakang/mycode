package com.lhk.juc.future2;

import java.util.concurrent.*;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 15:14
 */
public class Test {
    FutureTask abc;
    public static void main(String[] args) {
        try {
            Userinfo userinfo=new Userinfo();
            MyRunnable myRunnable=new MyRunnable(userinfo);
            ThreadPoolExecutor executor=new ThreadPoolExecutor(10,10,10,
                    TimeUnit.SECONDS,new LinkedBlockingDeque<>());
            Future<Userinfo> future=executor.submit(myRunnable,userinfo);
            System.out.println("begin time="+System.currentTimeMillis());
            userinfo=future.get();
            System.out.println("getValue"+userinfo.getUsername()+userinfo.getPassword());
            System.out.println("endTime ="+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
