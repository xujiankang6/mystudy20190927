package com.jiankang.headfirstdesign.modetolmodel.v1;

/**
 * 适配器模式
 */
public class GooseAdapter implements Quackable {

    Observable observable;


    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);

    }

    @Override
    public void quack() {
        goose.Goose();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
