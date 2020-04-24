package com.jiankang.javaprogramminglogic.chapter3.v4;

/*
 *@create by jiankang
 *@date 2020/4/23 time 13:21
 */

/**
 *
 * 模板方法：
 * action() 方法就是一个模板具体子类由 step1() 和 step2()
 *
 */
public class Child extends Base {

    @Override
    protected void step1() {
        System.out.println("child step : " + this.currentStep);
    }

    @Override
    protected void step2() {
        System.out.println("child step : " + this.currentStep);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.action();
    }
}
