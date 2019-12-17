package com.jiankang.designismethod2.visitorpattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/5 time 10:32
 */

public interface IVisitor {
    //可以访问哪些对象
    public void visit(ConcreteElement1 element);

    public void visit(ConcreteElement2 element);
}
