package com.jiankang.designismethod2.strategypattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/21 time 15:01
 */

public class ConcreteStrategy2 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略2的运算法则");
    }
}
