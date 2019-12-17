package com.jiankang.designismethod2.observablepattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/25 time 19:43
 */

import java.util.ArrayList;


public class HanFeiZi implements IHanFeiZi, Observable {

    //声明李斯
    private ArrayList<Observer> observerArrayList = new ArrayList<Observer>();


    public void haveBreakfast() {
        System.out.println("吃饭");
        this.notifyObservers("韩非子在吃饭");

    }


    public void haveFun() {
        System.out.println("开始娱乐了");
        this.notifyObservers("韩非子在娱乐");
    }


    //增加观察者
    @Override
    public void addObserver(Observer observer) {
        this.observerArrayList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerArrayList.add(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : observerArrayList) {
            observer.update(context);
        }
    }
}
