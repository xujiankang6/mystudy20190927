package com.jiankang.designismethod2.observablepattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/25 time 21:28
 * 具体的观察者，每个被观察者接收到消息后反应是不同的，各个观察者都有自己的处理逻辑
 */

public class ConcreteObserver1 implements Observer{

    @Override
    public void update() {
        System.out.println("接收到消息并进行处理1111");
    }
}
