package com.jiankang.designismethod2.decoratorpattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/21 time 14:19
 */

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void Operation() {
        super.Operation();
    }

    private void method2(){
        System.out.println("this method2 start");
    }
}
