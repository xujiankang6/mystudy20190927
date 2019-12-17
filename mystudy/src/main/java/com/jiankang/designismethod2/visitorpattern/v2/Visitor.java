package com.jiankang.designismethod2.visitorpattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/5 time 10:33
 */

public class Visitor implements IVisitor {


    @Override
    public void visit(ConcreteElement1 element) {
        element.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 element) {
        element.doSomething();
    }
}
