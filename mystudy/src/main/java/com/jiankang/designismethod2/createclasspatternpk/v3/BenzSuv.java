package com.jiankang.designismethod2.createclasspatternpk.v3;

/*
 *@create by jiankang
 *@date 2019/12/31 time 16:38
 */

public class BenzSuv extends AbsBenz {

    private  final static String B_SEARIES = "奔驰SUV";
    @Override
    public String getModel() {
        return B_SEARIES;
    }
}
