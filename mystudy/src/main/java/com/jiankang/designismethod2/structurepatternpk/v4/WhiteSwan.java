package com.jiankang.designismethod2.structurepatternpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/2 time 10:26
 */

import com.jiankang.designismethod2.structurepatternpk.v3.Swan;

public class WhiteSwan implements Swan {
    @Override
    public void fly() {
        System.out.println("can fly");
    }

    @Override
    public void cry() {
        System.out.println("白天鹅的叫声");
    }

    @Override
    public void desAppaearance() {
        System.out.println("外表都是beautiful");
    }
}
