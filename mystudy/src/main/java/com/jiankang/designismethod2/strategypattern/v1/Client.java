package com.jiankang.designismethod2.strategypattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/21 time 15:03
 */

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategy1());
        Context context1 = new Context(new ConcreteStrategy2());
        context.doAnything();
    }
}
