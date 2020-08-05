package com.lhk.juc.Exchanger2;

import java.util.concurrent.Exchanger;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/4 17:08
 */
public class Run {
    public static void main(String[] args) {
        Exchanger<String> exchanger=new Exchanger<String>();
        ThreadA a=new ThreadA(exchanger);
        a.start();
        System.out.println("main end!");
    }
}
