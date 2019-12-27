package com.jiankang.designismethod2.bridgepattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/26 time 20:00
 */

public class ClothesCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("服装公司生产衣服。。。。。");
    }

    @Override
    protected void sell() {
        System.out.println("服装公司出售衣服。。。。。");
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("服装公司挣小钱");
    }
}
