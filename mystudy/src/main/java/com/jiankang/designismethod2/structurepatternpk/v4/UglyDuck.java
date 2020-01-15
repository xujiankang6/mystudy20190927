package com.jiankang.designismethod2.structurepatternpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/2 time 10:28
 */

public class UglyDuck extends WhiteSwan implements Duck {

    @Override
    public void cry() {
        super.cry();
    }

    @Override
    public void desAppearance() {
        super.desAppaearance();
    }

    @Override
    public void desBehavior() {
        super.fly();
    }

}
