package com.jiankang.designismethod2.decoratorpattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/21 time 14:11
 */

public abstract class Decorator extends  Component{
    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        this.component.Operation();
    }
}
