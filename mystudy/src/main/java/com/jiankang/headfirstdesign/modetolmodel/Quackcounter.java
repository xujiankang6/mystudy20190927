package com.jiankang.headfirstdesign.modetolmodel;

import com.jiankang.headfirstdesign.Quackable;

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
}
