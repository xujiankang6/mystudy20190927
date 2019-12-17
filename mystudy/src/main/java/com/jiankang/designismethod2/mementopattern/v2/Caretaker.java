package com.jiankang.designismethod2.mementopattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/26 time 21:11
 * 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在对象之外保存这个状态。
 */

public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }


}
