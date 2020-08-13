package com.lhk.juc.completionService2;

import com.lhk.juc.completionService.MyCallable;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/12 12:45
 */
public class MyRunnable implements Runnable {
    private Userinfo userinfo;
    public MyRunnable(Userinfo userinfo){
        super();
        this.userinfo=userinfo;
    }
    @Override
    public void run() {
    userinfo.setUsername("usernameValue");
    userinfo.setPassword("passwordValue");
        System.out.println("run 运行了");
    }
}
