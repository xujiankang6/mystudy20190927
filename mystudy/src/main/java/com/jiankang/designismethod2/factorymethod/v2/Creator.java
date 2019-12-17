package com.jiankang.designismethod2.factorymethod.v2;

/*
 *@create by jiankang
 *@date 2019/11/2 time 20:32
 */

public abstract class Creator {
    public  abstract <T extends Product> T createProduct(Class<T> c);
}
