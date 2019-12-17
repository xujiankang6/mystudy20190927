package com.jiankang.headfirstdesign.modetolmodel;

import com.jiankang.headfirstdesign.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new Quackcounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new Quackcounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new Quackcounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new Quackcounter(new RubberDuck());
    }
}
