package com.jiankang.designismethod2.statuspattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/11 time 13:23
 */

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteState1());
        context.handle1();
        context.handle2();
        context.handle3();
    }
}
