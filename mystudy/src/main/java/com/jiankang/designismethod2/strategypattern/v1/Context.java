package com.jiankang.designismethod2.strategypattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/21 time 15:01
 */

public class Context {
    //抽象 策略
    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //封装后的策略方法
    public void doAnything() {
        this.strategy.doSomething();
    }
}
