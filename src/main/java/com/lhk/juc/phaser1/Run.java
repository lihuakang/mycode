package com.lhk.juc.phaser1;

import java.util.concurrent.Phaser;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/5 16:53
 */
public class Run {
    public static void main(String[] args) {
        Phaser phaser=new Phaser(3);
        PrintTools.phaser=phaser;
        ThreadA a=new ThreadA(phaser);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(phaser);
        b.setName("B");
        b.start();
        ThreadC c=new ThreadC(phaser);
        c.setName("C");
        c.start();
    }
}
