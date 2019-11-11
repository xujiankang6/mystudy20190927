package com.jiankang.designismethod2.builderpattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/11 time 16:19
 */

public class Director {
    private Builder builder = new ConcreteProduct();


    public Product getAProduct() {
        builder.setPart();
        /**
         * 设置不同的零件，产生不同的产品
         */
        return builder.buildProduct();
    }

}
