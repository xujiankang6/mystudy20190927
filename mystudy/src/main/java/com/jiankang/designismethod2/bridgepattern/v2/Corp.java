package com.jiankang.designismethod2.bridgepattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/26 time 19:56
 */

public abstract class Corp {

    protected abstract void produce();

    protected abstract void sell();


    public void makeMoney() {
        this.produce();
        this.sell();
    }

}
