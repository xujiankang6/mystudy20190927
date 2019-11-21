package com.jiankang.designismethod2.strategypattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/21 time 15:00
 */

public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
