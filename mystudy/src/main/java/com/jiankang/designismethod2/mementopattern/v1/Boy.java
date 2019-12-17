package com.jiankang.designismethod2.mementopattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/26 time 20:39
 */

public class Boy {
    //男孩的状态
    private String state = "";

    public void changeState() {
        this.state = "心情可能不好";
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    //保留一个备份
    public Memento createMemento() {
        return new Memento(this.state);
    }

    //恢复一个备份
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
