package com.jiankang.designismethod2.bridgepattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/26 time 20:05
 */

public class IPodCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("我生产iPod。。。");
    }

    @Override
    protected void sell() {
        System.out.println("iPod 畅销");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("wo get money ");
    }
}
