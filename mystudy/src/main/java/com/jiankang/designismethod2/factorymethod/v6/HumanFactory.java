package com.jiankang.designismethod2.factorymethod.v6;

/*
 *@create by jiankang
 *@date 2019/11/8 time 14:58
 */

public interface HumanFactory {

    //制造一个黄色人种
    public Human createYellowHuman();
    //制造一个白色人种
    public Human createWhiteHuman();
    //制造一个黑色人种
    public Human createBlackHuman();
}
