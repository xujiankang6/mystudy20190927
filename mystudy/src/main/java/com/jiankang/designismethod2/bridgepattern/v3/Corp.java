package com.jiankang.designismethod2.bridgepattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/26 time 19:56
 */

public abstract class Corp {
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }



    public void makeMoney() {
        this.product.beProducted();
        this.product.beSelled();
    }

}
