package com.jiankang.designismethod2.createclasspatternpk.v3;

/*
 *@create by jiankang
 *@date 2019/12/31 time 16:35
 */

public abstract class AbsBMW implements ICar {
    private final static String BMW_BAND = "宝马汽车";

    @Override
    public String getBand() {
        return BMW_BAND;
    }

    public abstract String getModel();
}
