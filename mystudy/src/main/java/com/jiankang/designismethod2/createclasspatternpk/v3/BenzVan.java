package com.jiankang.designismethod2.createclasspatternpk.v3;

/*
 *@create by jiankang
 *@date 2019/12/31 time 16:38
 */

public class BenzVan extends AbsBenz {

    private  final static String R_SEARIES = "奔驰R";
    @Override
    public String getModel() {
        return R_SEARIES;
    }
}
