package com.lhk.juc.Exchanger;

import java.util.concurrent.Exchanger;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/4 11:25
 */
public class Run {
    public static void main(String[] args) {
        Exchanger<String> exchanger=new Exchanger<String>();
        ThreadA a=new ThreadA(exchanger);
        ThreadB b=new ThreadB(exchanger);
        a.start();
        b.start();
        System.out.println("main end");
    }
}
