package com.jiankang.designismethod2.templatemethod.v2;

/*
 *@create by jiankang
 *@date 2019/11/11 time 11:56
 */

/**
 * 抽象模板中的基本方法尽量设计为protected类型，符合迪米特法则，不需要暴露
 * 的属性或方法尽量不要设置为protected类型。实现类若非必要，尽量不要扩大父类中的访问
 * 权限。
 * 1、行为由父类控制，子类实现
 * 2、基本方法是由子类实现的，因此子类可以通过扩展的方式增加相应的功能，符合开闭原
 * 则。
 */
public abstract class AbstractClass {

    protected abstract void doanything();

    protected abstract  void dosomething();


    public void templateMethod(){
        this.doanything();
        this.dosomething();
    }
}
