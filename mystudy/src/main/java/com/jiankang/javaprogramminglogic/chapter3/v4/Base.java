package com.jiankang.javaprogramminglogic.chapter3.v4;

/*
 *@create by jiankang
 *@date 2020/4/23 time 13:19
 */

public class Base {
    protected int currentStep;

    protected void step1() {

    }

    protected void step2() {

    }

    public void action() {
        this.currentStep = 1;
        step1();
        this.currentStep = 2;
        step2();
    }
}
