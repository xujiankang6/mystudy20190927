package com.jiankang.designismethod2.accesswarpk.v7;

/*
 *@create by jiankang
 *@date 2020/1/12 time 21:30
 */

public class Deny extends  Decorator {

    public Deny(IStar star) {
        super(star);
    }

    @Override
    public void act() {
        super.act();
        System.out.println("抵赖，死不承认");
    }

}
