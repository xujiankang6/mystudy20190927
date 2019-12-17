package com.jiankang.designismethod2.factorymethod.v3;

/*
 *@create by jiankang
 *@date 2019/11/3 time 12:24
 */
/**
 * 延迟加载的工厂类
 */

import com.jiankang.designismethod2.factorymethod.v2.Product;

public class Test {
    public static void main(String[] args) throws Exception {
        Product product=ProductFactory.createProduct("Product1");
        Product product1=ProductFactory.createProduct("Product1");
        product.method1();
        product1.method2();
    }
}
