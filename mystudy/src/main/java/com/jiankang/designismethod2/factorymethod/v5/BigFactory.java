package com.jiankang.designismethod2.factorymethod.v5;

/*
 *@create by jiankang
 *@date 2019/11/2 time 21:09
 */

import com.jiankang.designismethod2.factorymethod.v1.Human;

public abstract class BigFactory {
    public abstract <T extends AbstractHumanFactory> T createHumanFactory(Class<T> c);
}
