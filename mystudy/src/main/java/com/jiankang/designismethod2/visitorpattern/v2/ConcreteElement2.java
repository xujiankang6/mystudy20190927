package com.jiankang.designismethod2.visitorpattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/5 time 10:36
 */

public class ConcreteElement2 extends Element {
    @Override
    public void doSomething() {
        System.out.println("ConcreteElement2 doSomething");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
