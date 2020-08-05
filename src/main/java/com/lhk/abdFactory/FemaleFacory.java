package com.lhk.abdFactory;

/**
 * 生产女性的工厂
 */
public class FemaleFacory {
    public Human createYellowHuman(){
        return new FemaleYellowHuman();
    }
}
