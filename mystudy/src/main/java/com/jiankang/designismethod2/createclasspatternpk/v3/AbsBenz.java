package com.jiankang.designismethod2.createclasspatternpk.v3;

/*
 *@create by jiankang
 *@date 2019/12/31 time 16:35
 */

public abstract class AbsBenz implements ICar {
    private final static String BENZ_BAND = "奔驰汽车";

    @Override
    public String getBand() {
        return BENZ_BAND;
    }

    public abstract String getModel();
}
