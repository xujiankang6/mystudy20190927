package com.jiankang.headfirstdesign.modetolmodel;

import com.jiankang.headfirstdesign.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();


}
