package com.jiankang.designismethod2.mediummethod.v2;

/*
 *@create by jiankang
 *@date 2019/11/18 time 18:35
 */

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    //自有方法 self-method
    public void selfMethod1(){
        //处理自己的业务
    }

    //依赖方法 dep-method
    public void depMethod1(){
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething2();
    }
}
