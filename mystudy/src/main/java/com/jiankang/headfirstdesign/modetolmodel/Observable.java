package com.jiankang.headfirstdesign.modetolmodel;

/*
 *@create by jiankang
 *@date 2019/12/17 time 20:59
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {
    ArrayList<Observer> observers = new ArrayList<Observer>();
    QuackObservable quackObservable;

    public Observable(QuackObservable quackObservable) {
        this.quackObservable = quackObservable;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(quackObservable);
        }
    }
}
