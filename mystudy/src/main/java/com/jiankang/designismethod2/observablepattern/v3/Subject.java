package com.jiankang.designismethod2.observablepattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/25 time 21:21
 * 定义被观察者，必须能够动态的增加，取消观察者，管理观察者并通知观察者
 *
 */

import java.util.Vector;

public abstract class Subject {
    //定义一个观察者数组
    //arrayList 线程异步，不安全， Vector 线程同步，安全
    private Vector<Observer> observers = new Vector<Observer>();

    public void Attach(Observer observer){
        this.observers.add(observer);
    }

    public void Detach(Observer observer){
        this.observers.remove(observer);
    }

    public void Notify(){
        for (Observer observer:observers){
            observer.update();
        }
    }

    public abstract void doSomething();
}
