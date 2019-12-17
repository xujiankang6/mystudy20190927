package com.jiankang.designismethod2.decoratorpattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/21 time 14:10
 */

public class ConcreteComponent extends Component {
    @Override
    public void Operation() {
        System.out.println("ConcreteComponent start");
    }
}
