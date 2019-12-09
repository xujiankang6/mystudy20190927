package com.jiankang.designismethod2.mementopattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/27 time 10:03
 * 发起人角色，记录当前的内部状态，负责创建和恢复备忘录数据
 */

public class Originator {
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建一个备忘录
    public Memento createMemento(){
        return  new Memento(this.state);
    }

    // 恢复一个备忘录
    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}
