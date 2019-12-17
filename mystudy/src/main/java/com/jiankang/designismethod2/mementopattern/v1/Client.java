package com.jiankang.designismethod2.mementopattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/26 time 20:41
 */

public class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setState("心情很好");
        System.out.println("==状态==");
        System.out.println(boy.getState());
        //记录下当前状态
        Memento memento = boy.createMemento();
        boy.changeState();
        System.out.println(boy.getState());
        boy.restoreMemento(memento);
        System.out.println(boy.getState());

    }
}
