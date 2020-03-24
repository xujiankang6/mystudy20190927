package com.jiankang.designismethod2.createclasspatternpk.v3;

/*
 *@create by jiankang
 *@date 2019/12/31 time 16:49
 */

public class BMWFactory implements  CarFactory {
    @Override
    public ICar createSuv() {
        return new BMWSuv();
    }

    @Override
    public ICar createVan() {
        return new BMWVan();
    }
}
