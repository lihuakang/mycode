package com.lhk.design.strategy;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/11 9:30
 */
public class Hand {
    public static final int HANDVALUE_GUU=0;//石头
    public static final int HANDVALUE_CHO=1;//剪刀
    public static final int HANDVALUE_PAA=2;//布
    public static final Hand[] hand={
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA),
    };
    private static final String[] name={
            "石头","剪刀","布"
    };
    private int handvalue;
    private Hand(int handvalue){
        this.handvalue=handvalue;
    }

}
