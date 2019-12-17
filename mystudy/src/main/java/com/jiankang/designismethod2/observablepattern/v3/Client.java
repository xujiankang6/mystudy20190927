package com.jiankang.designismethod2.observablepattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/25 time 21:41
 */

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.Attach(new ConcreteObserver());
        subject.Attach(new ConcreteObserver1());
        subject.doSomething();
    }
}
