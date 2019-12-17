package com.jiankang.designismethod2.strategypattern;

/*
 *@create by jiankang
 *@date 2019/11/21 time 14:47
 */

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void Operate(){
        this.strategy.operate();
    }
}
