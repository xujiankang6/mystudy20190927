package com.jiankang.designismethod2.bridgepattern.v1;

/*
 *@create by jiankang
 *@date 2019/12/25 time 17:36
 */

import com.jiankang.designismethod2.visitorpattern.v4.AbsActor;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void request() {
        super.request();
        super.getImplementor().doAnything();
    }
}
