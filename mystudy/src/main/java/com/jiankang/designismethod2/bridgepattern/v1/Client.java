package com.jiankang.designismethod2.bridgepattern.v1;

/*
 *@create by jiankang
 *@date 2019/12/25 time 17:38
 */

public class Client {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementor1();
        Abstraction abs = new RefinedAbstraction(implementor);
        abs.request();
    }
}
