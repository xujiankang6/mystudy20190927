package com.jiankang.designismethod2.accesswarpk.v7;

/*
 *@create by jiankang
 *@date 2020/1/12 time 21:28
 */

public abstract class Decorator implements IStar {

    private IStar star;

    public Decorator(IStar star) {
        this.star = star;
    }

    @Override
    public void act() {
        this.star.act();
    }
}
