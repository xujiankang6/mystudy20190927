package com.jiankang.designismethod2.abstractfactory;

/*
 *@create by jiankang
 *@date 2019/11/8 time 15:16
 */

public abstract class AbstractProductA {

    //每个产品共有的方法
    public void shareMethod(){

    }
    //每个产品相同方法，不同实现
    public abstract void doSomething();
}
