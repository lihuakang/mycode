package com.lhk.abdFactory;

public class MaleFactory implements HumanFactory {
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    public Human createWhiteHuman() {
        return null;
    }

    public Human createBlackHuman() {
        return null;
    }
}
