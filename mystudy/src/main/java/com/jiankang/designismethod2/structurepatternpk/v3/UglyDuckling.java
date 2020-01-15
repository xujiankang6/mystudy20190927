package com.jiankang.designismethod2.structurepatternpk.v3;

/*
 *@create by jiankang
 *@date 2020/1/2 time 10:13
 */

public class UglyDuckling implements Swan {
    @Override
    public void fly() {
        System.out.println("ugly can't fly");
    }

    @Override
    public void cry() {
        System.out.println("ugly cry");
    }

    @Override
    public void desAppaearance() {
        System.out.println("外形难看");
    }
}
