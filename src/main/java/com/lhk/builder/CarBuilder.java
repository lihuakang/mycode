package com.lhk.builder;

import java.util.ArrayList;

/**
 * 抽象汽车组装者
 */
public abstract class CarBuilder {
    //组装顺序
    public abstract void setSequence(ArrayList<String> suquence);
    //设置完毕顺序，直接拿到这个车辆模型
    public abstract CarModel getCarModel();
}
