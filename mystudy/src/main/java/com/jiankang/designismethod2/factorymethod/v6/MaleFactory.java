package com.jiankang.designismethod2.factorymethod.v6;

/*
 *@create by jiankang
 *@date 2019/11/8 time 15:00
 */

public class MaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
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
