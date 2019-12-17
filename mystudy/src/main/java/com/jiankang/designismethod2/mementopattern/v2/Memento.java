package com.jiankang.designismethod2.mementopattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/26 time 20:57
 */

public class Memento {
    //男孩的状态
    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
