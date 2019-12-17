package com.jiankang.headfirstdesign.modetolmodel;

/*
 *@create by jiankang
 *@date 2019/12/17 time 21:16
 */

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
