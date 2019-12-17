package com.jiankang.designismethod2.statuspattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/11 time 14:46
 */

public class ConcreteState3 extends State {
    @Override
    public void handle1() {
        super.context.setState(Context.STATE1);
        super.context.getState().handle1();
    }

    @Override
    public void handle2() {
        super.context.setState(Context.STATE2);
        super.context.getState().handle2();
    }

    @Override
    public void handle3() {
        System.out.println("handle3 do something");
    }
}
