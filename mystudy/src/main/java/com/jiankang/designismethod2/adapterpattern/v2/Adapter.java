package com.jiankang.designismethod2.adapterpattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/21 time 18:03
 */

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
