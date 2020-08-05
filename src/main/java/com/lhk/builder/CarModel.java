package com.lhk.builder;

import java.util.ArrayList;

public abstract class CarModel {
    //装组装的顺序
    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    final public void run(){

    }
}
