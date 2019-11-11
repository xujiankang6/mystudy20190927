package com.jiankang.designismethod2.builderpattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/11 time 16:17
 */

public class ConcreteProduct extends Builder {

    private Product product = new Product();

    @Override
    public void setPart() {
        /*
        产品类内的逻辑处理
         */

    }

    //组建一个产品
    @Override
    public Product buildProduct() {
        return product;
    }
}
