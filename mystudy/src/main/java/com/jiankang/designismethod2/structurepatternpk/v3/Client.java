package com.jiankang.designismethod2.structurepatternpk.v3;

/*
 *@create by jiankang
 *@date 2020/1/2 time 10:18
 */

public class Client {
    public static void main(String[] args) {
        Swan swan = new BeautiflyAppearance(new StrongBehavior(new Decorator(new UglyDuckling())));
        swan.desAppaearance();
        swan.cry();
        swan.fly();
    }
}
