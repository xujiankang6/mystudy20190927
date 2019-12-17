package com.jiankang.designismethod2.mementopattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/27 time 10:06
 * 看守者： 对备忘录进行管理，保存和提供备忘录
 */

public class Caretaker {
    //备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
