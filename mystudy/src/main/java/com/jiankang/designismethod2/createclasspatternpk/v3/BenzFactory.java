package com.jiankang.designismethod2.createclasspatternpk.v3;

/*
 *@create by jiankang
 *@date 2019/12/31 time 16:50
 */

public class BenzFactory implements CarFactory {
    @Override
    public ICar createSuv() {
        return new BenzSuv();
    }

    @Override
    public ICar createVan() {
        return new BenzVan();
    }
}
