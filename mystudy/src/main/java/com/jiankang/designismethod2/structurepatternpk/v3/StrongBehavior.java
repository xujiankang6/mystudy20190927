package com.jiankang.designismethod2.structurepatternpk.v3;

/*
 *@create by jiankang
 *@date 2020/1/2 time 10:17
 */

public class StrongBehavior extends Decorator {

    public StrongBehavior(Swan swan) {
        super(swan);
    }

    @Override
    public void fly() {
        System.out.println("会飞行了");
    }
}
