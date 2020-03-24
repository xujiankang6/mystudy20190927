package com.jiankang.designismethod2.bridgepattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/26 time 20:14
 */

public class IPod extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产iPod");
    }

    @Override
    public void beSelled() {
        System.out.println("销售iPod");
    }
}
