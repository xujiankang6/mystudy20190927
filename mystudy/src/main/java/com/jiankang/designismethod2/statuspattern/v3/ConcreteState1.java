package com.jiankang.designismethod2.statuspattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/11 time 13:13
 */

import singletoninstance.StaticSingleton;

public class ConcreteState1 extends State {

    @Override
    public void handle1() {
        System.out.println("handle1 do something");

    }

    @Override
    public void handle2() {
        super.context.setState(Context.STATE2);
        super.context.getState().handle2();
    }

    @Override
    public void handle3() {
        super.context.setState(Context.STATE3);
        super.context.getState().handle3();
    }
}
