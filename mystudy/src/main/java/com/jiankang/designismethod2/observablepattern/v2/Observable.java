package com.jiankang.designismethod2.observablepattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/25 time 19:47
 * 观察者模式，发布订阅模式
 * 定义一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖他的对象都会得到通知并自动更新
 */



public interface Observable {
    //增加一个观察者
    public void addObserver(Observer observer);

    //删除一个观察者
    public void deleteObserver(Observer observer);

    //既然要观察，我发生改变了他也应该有所动作，通知观察者
    public void notifyObservers(String context);

}
