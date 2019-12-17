package com.jiankang.designismethod2.mediummethod.v2;

/*
 *@create by jiankang
 *@date 2019/11/18 time 18:34
 */

public abstract  class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
