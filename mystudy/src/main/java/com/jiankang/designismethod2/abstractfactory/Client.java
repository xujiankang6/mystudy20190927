package com.jiankang.designismethod2.abstractfactory;

/*
 *@create by jiankang
 *@date 2019/11/8 time 15:26
 */

public class Client {

    public static void main(String[] args) {
        AbstractCreator creator1=new Creator1();
        AbstractCreator creator2=new Creator2();
        AbstractProductA a1 = creator1.createProductA();
        AbstractProductB b1=creator1.createProductB();
        AbstractProductB b2 = creator2.createProductB();
        AbstractProductA a2 = creator2.createProductA();
        a1.doSomething();

    }
}
