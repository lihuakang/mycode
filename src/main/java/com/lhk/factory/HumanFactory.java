package com.lhk.factory;

public class HumanFactory extends AbstractHumanFactory {
    public <T extends Human> T createHum(Class<T> c) {
        //定义一个生产的人种
        Human human=null;
        try {
            human=(T)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
