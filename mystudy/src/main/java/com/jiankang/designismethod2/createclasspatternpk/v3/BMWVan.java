package com.jiankang.designismethod2.createclasspatternpk.v3;

/*
 *@create by jiankang
 *@date 2019/12/31 time 16:38
 */

public class BMWVan extends AbsBMW {

    private  final static String SEVENT_SEARIES = "7系列车型商务车";
    @Override
    public String getModel() {
        return SEVENT_SEARIES;
    }
}
