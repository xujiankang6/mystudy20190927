package com.jiankang.designismethod2.structurepatternpk.v3;

/*
 *@create by jiankang
 *@date 2020/1/2 time 10:15
 */

public class Decorator implements Swan {
    private Swan swan;

    public Decorator(Swan swan) {
        this.swan = swan;
    }

    @Override
    public void fly() {
        swan.fly();
    }

    @Override
    public void cry() {
        swan.cry();
    }

    @Override
    public void desAppaearance() {
        swan.desAppaearance();
    }
}
