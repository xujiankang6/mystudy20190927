package com.jiankang.designismethod2.adapterpattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/21 time 18:01
 */

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need any help,pls call me!");
    }
}
