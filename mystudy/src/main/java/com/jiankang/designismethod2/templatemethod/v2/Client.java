package com.jiankang.designismethod2.templatemethod.v2;

/*
 *@create by jiankang
 *@date 2019/11/11 time 12:00
 */

public class Client {
    public static void main(String[] args) {
        AbstractClass concreteClass1=new ConcreteClass1();
        AbstractClass abstractClass2=new ConcreteClass2();
        //调用模板方法
        abstractClass2.templateMethod();
        concreteClass1.templateMethod();
    }
}
