package com.jiankang.designismethod2.structurepatternpk.v3;

/*
 *@create by jiankang
 *@date 2020/1/2 time 10:17
 */

public class BeautiflyAppearance extends Decorator {

    public BeautiflyAppearance(Swan swan) {
        super(swan);
    }

    @Override
    public void desAppaearance() {
        System.out.println("外表纯白色，非常惹人喜欢");
    }
}
