package com.jiankang.designismethod2.decoratorpattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/21 time 14:19
 */

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteDecorator2(new ConcreteComponent());
        component.Operation();
    }
}
