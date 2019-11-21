package com.jiankang.designismethod2.decoratorpattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/21 time 14:13
 */

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void Operation() {
        this.method1();
        super.Operation();
    }

    private void method1(){
        System.out.println("method1 修饰");
    }
}
