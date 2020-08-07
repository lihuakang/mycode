package com.lhk.juc.phaser1;

import java.util.concurrent.Phaser;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/5 16:52
 */
public class ThreadA extends Thread {
    private Phaser phaser;
    public ThreadA(Phaser phaser){
        super();
        this.phaser=phaser;
    }
    public void run(){
        PrintTools.methodA();
    }
}
