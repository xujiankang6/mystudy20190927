package com.jiankang.designismethod2.abstractfactory;

/*
 *@create by jiankang
 *@date 2019/11/8 time 15:21
 */

public abstract class AbstractCreator {
    //创建A产品家族
    public abstract AbstractProductA createProductA();

    //创建B产品家族
    public abstract AbstractProductB createProductB();

}
