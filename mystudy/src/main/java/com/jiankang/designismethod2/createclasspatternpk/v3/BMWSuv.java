package com.jiankang.designismethod2.createclasspatternpk.v3;

/*
 *@create by jiankang
 *@date 2019/12/31 time 16:38
 */

public class BMWSuv extends AbsBMW {

    private  final static String X_SEARIES = "X系列车型SUV";
    @Override
    public String getModel() {
        return X_SEARIES;
    }
}
