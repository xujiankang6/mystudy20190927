package com.jiankang.headfirstdesign.modetolmodel.v1;

/**
 * 装饰者模式
 */

public class Quackcounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public Quackcounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
