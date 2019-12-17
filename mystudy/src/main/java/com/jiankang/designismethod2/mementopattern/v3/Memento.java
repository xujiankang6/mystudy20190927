package com.jiankang.designismethod2.mementopattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/27 time 10:05
 * 备忘录角色： 存储发起人的内部状态。
 */

public class Memento {

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
