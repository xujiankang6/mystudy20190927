package com.jiankang.designismethod2.createclasspatternpk.v2;

/*
 *@create by jiankang
 *@date 2019/12/31 time 15:55
 */

public class AdultSuperManBuilder extends Builder {
    @Override
    public SuperMan getSuperMan() {
        super.setBody("强壮的躯体");
        super.setSpecialSymbol("胸前的s标记");
        super.setSpecialTalent("会飞行");
        return super.superMan;
    }
}
