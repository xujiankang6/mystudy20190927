package com.jiankang.designismethod2.createclasspatternpk.v3;

/*
 *@create by jiankang
 *@date 2019/12/31 time 16:45
 */

/**
 * 抽象工厂模式
 */
public interface CarFactory {
    public ICar createSuv();

    public ICar createVan();

}
