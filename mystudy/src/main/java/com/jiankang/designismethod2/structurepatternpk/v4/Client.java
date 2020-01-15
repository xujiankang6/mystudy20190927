package com.jiankang.designismethod2.structurepatternpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/2 time 10:30
 */

public class Client {
    public static void main(String[] args) {
        Duck duck = new UglyDuck();
        System.out.println("ugly's ==========================================");
        duck.cry();
        duck.desAppearance();
        duck.desBehavior();
        System.out.println("real duck's ======================================");
        Duck duck1 = new Duckling();
        duck1.desBehavior();
        duck1.desAppearance();
        duck1.cry();
    }
}
