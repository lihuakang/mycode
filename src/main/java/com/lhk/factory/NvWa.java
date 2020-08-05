package com.lhk.factory;

public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory yinYangLu=new HumanFactory();
        Human whiteHuman=yinYangLu.createHum(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
    }
}
