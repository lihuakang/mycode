package com.lhk.design.builder;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 17:01
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }
    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[]{
                "早上好。",
                "下午好。"
        });
        builder.close();
    }

}
