package com.jiankang.designismethod2.strategypattern;

/*
 *@create by jiankang
 *@date 2019/11/21 time 14:48
 */

public class ZhaoYun {
    public static void main(String[] args) {
        Context context;

        context = new Context(new BackDoor());
        context.Operate();
        context = new Context(new GivenGreenLight());
        context.Operate();
        context = new Context(new BlockEnemy());
        context.Operate();
    }
}
