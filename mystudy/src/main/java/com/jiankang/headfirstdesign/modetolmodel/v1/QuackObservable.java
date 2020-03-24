package com.jiankang.headfirstdesign.modetolmodel.v1;

/*
 *@create by jiankang
 *@date 2019/12/17 time 20:57
 */

public interface QuackObservable {
    public void registerObserver(Observer observer);

    public void notifyObservers();
}
