package com.jiankang.designismethod2.structurepatternpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/2 time 10:25
 */

public class Duckling implements Duck {
    @Override
    public void cry() {
        System.out.println("叫声是嘎嘎嘎嘎");
    }

    @Override
    public void desAppearance() {
        System.out.println("鸭子外表");
    }

    @Override
    public void desBehavior() {
        System.out.println("会游泳");
    }
}
