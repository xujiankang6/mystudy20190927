package com.jiankang.designismethod2.mementopattern.v4;

/*
 *@create by jiankang
 *@date 2019/11/27 time 10:03
 * 发起人角色，记录当前的内部状态，负责创建和恢复备忘录数据
 */

public class Originator implements Cloneable {

    private Originator backup;
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建一个备忘录
    public void createMemento() throws CloneNotSupportedException {
        this.backup = (Originator) this.clone();
    }

    // 恢复一个备忘录
    public void restoreMemento() {
        this.setState(this.backup.getState());
    }

    //克隆当前对象
    @Override
    protected Originator clone() throws CloneNotSupportedException {
        return (Originator) super.clone();
    }
}
