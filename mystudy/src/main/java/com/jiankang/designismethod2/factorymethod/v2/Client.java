package com.jiankang.designismethod2.factorymethod.v2;

/*
 *@create by jiankang
 *@date 2019/11/2 time 20:35
 */

public class Client {
    public static void main(String[] args) {
        Creator creator=new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        product.method1();
        product.method2();


    }
}
