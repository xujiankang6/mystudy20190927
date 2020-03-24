package com.jiankang.designismethod2.bridgepattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/26 time 20:12
 */

public class House extends  Product {
    @Override
    public void beProducted() {
        System.out.println("生产房子");
    }

    @Override
    public void beSelled() {
        System.out.println("销售房子");
    }
}
