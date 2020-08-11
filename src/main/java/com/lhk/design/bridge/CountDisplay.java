package com.lhk.design.bridge;

/**
 * @Author : lhk
 * @Description :
 * @Date : 2020/8/10 17:42
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int times){
        open();
        for (int i=0;i<times;i++){
            print();
        }
        close();
    }
}
