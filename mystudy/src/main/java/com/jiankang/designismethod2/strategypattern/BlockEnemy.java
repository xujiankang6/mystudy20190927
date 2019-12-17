package com.jiankang.designismethod2.strategypattern;

/*
 *@create by jiankang
 *@date 2019/11/21 time 14:46
 */

public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
