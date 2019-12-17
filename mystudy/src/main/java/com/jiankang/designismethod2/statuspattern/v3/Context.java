package com.jiankang.designismethod2.statuspattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/11 time 13:11
 */
public class Context {
    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();
    public final static State STATE3 = new ConcreteState3();

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void handle1() {
        this.state.handle1();
    }

    public void handle2() {
        this.state.handle2();
    }

    public void handle3() {
        this.state.handle3();
    }
}
