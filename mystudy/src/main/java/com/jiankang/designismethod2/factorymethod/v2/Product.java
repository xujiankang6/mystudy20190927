package com.jiankang.designismethod2.factorymethod.v2;

/*
 *@create by jiankang
 *@date 2019/11/2 time 20:30
 */

public abstract class Product {
    //产品类的公共方法
    public void method1(){
//业务逻辑处理
        System.out.println("method1");
    }
    //抽象方法
    public abstract void method2();

}