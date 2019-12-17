package com.jiankang.designismethod2.statuspattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/11 time 13:13
 */

public class ConcreteState2 extends State {

    @Override
    public void handle1() {
        super.context.setState(Context.STATE1);
        super.context.handle1();

    }

    @Override
    public void handle2() {
        System.out.println("handle2 do something");
    }

    @Override
    public void handle3() {
        super.context.setState(Context.STATE3);
        super.context.getState().handle3();
    }
}
