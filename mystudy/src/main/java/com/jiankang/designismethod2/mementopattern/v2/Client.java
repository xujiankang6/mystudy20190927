package com.jiankang.designismethod2.mementopattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/26 time 20:41
 */

import com.jiankang.designismethod2.strategypattern.v3.Calculator;

public class Client {
    public static void main(String[] args) {
        //声明出主角
        Boy boy = new Boy();

        //声明出备忘录的管理者
        Caretaker caretaker = new Caretaker();
        boy.setState("心情很好");
        System.out.println(boy.getState());
        //记录下当前状态
        caretaker.setMemento(boy.createMemento());
        boy.changeState();
        System.out.println(boy.getState());
        boy.restoreMemento(caretaker.getMemento());
        System.out.println(boy.getState());

    }
}
