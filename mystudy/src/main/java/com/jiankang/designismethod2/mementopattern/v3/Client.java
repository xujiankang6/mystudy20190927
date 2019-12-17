package com.jiankang.designismethod2.mementopattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/27 time 17:05
 */

public class Client {
    public static void main(String[] args) {
        //定义出发起人
        Originator originator = new Originator();
        //定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        //创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        originator.restoreMemento(caretaker.getMemento());
    }
}
