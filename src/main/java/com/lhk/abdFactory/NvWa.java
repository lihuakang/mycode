package com.lhk.abdFactory;

public class NvWa {
    public static void main(String[] args) {
        HumanFactory maleHumanFactory=new MaleFactory();
        Human maleYellow=maleHumanFactory.createYellowHuman();
        maleYellow.getColor();
        maleYellow.getSex();

    }
}
