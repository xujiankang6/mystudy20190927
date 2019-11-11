package com.jiankang.designismethod2.abstractfactory;

/*
 *@create by jiankang
 *@date 2019/11/8 time 15:24
 */

public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
