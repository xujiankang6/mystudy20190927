package com.jiankang.designismethod2.observablepattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/25 time 21:23
 * 定义被观察者自己的业务，同时定义对哪些事件进行通知
 */


public class ConcreteSubject extends Subject {

    //具体的业务
    public void doSomething(){
        /*
        do something
         */
        System.out.println("我要杀人了" +
                "");
        super.Notify();
    }
}
