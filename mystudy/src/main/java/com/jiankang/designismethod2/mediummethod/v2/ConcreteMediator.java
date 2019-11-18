package com.jiankang.designismethod2.mediummethod.v2;

/*
 *@create by jiankang
 *@date 2019/11/18 time 18:33
 */

public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();

    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
