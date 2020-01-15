package com.jiankang.designismethod2.bridgepattern.v1;

/*
 *@create by jiankang
 *@date 2019/12/25 time 17:33
 */

public abstract class Abstraction {
    //定义对实现化角色的引用
    private Implementor implementor;

    //约束了子类必须实现该构造函数
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    //自身的行为和属性
    public void request() {
        this.implementor.doSomething();
    }

    //获得实现化的角色
    public Implementor getImplementor() {
        return implementor;
    }
}
