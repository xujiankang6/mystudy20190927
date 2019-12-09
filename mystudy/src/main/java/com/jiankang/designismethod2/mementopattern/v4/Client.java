package com.jiankang.designismethod2.mementopattern.v4;

/*
 *@create by jiankang
 *@date 2019/11/27 time 17:05
 */

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //定义出发起人
        Originator originator = new Originator();
        originator.setState("初始状态为：");
        System.out.println(originator.getState());
        //建立备份
        originator.createMemento();
        //修改状态
        originator.setState("修改状态为：");
        System.out.println(originator.getState());
        //恢复原有状态
        originator.restoreMemento();
        System.out.println(originator.getState());
    }
}
