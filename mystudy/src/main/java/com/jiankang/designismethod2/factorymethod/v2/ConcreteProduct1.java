package com.jiankang.designismethod2.factorymethod.v2;

/*
 *@create by jiankang
 *@date 2019/11/2 time 20:30
 */

import java.util.function.Predicate;

public class ConcreteProduct1 extends Product {
    @Override
    public void method2() {
        System.out.println(" ConcreteProduct1 method2");
    }
}
