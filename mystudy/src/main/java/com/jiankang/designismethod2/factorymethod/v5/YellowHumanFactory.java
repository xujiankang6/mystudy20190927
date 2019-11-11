package com.jiankang.designismethod2.factorymethod.v5;

/*
 *@create by jiankang
 *@date 2019/11/2 time 21:02
 */

public class YellowHumanFactory extends AbstractHumanFactory {
    public Human createHuman() {
        return new YellowHuman();
    }
}