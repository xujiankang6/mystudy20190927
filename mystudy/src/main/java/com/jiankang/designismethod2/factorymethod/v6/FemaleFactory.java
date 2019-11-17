package com.jiankang.designismethod2.factorymethod.v6;

/*
 *@create by jiankang
 *@date 2019/11/8 time 14:59
 */

public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }

    @Override
    public Human createBlackHuman() {
        return null;
    }
}
