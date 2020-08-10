package com.lhk.design.adapter;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 12:51
 */
public class Banner {
    private String string;
    public Banner(String string){
        this.string=string;
    }
    public void showWithParen(){
        System.out.println("("+string+")");
    }
    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
