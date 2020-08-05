package com.lhk.factory;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHum(Class<T> c);
}
