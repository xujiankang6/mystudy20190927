package com.jiankang.designismethod2.factorymethod.v1;

/*
 *@create by jiankang
 *@date 2019/11/2 time 19:55
 */

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
