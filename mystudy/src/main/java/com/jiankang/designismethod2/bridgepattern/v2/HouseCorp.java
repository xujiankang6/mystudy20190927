package com.jiankang.designismethod2.bridgepattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/26 time 19:58
 */

public class HouseCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("房地产公司盖房子");
    }

    @Override
    protected void sell() {
        System.out.println("房地产公司出售房子");
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司挣大钱了");
    }
}
