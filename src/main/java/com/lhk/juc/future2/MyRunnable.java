package com.lhk.juc.future2;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 15:12
 */
public class MyRunnable implements Runnable{
    private Userinfo userinfo;
    public MyRunnable(Userinfo userinfo){
        this.userinfo=userinfo;
    }
    @Override
    public void run() {
    userinfo.setUsername("usernameValue");
    userinfo.setPassword("passwordValue");
    }
}
