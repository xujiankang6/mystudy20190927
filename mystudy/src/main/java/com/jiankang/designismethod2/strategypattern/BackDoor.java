package com.jiankang.designismethod2.strategypattern;

/*
 *@create by jiankang
 *@date 2019/11/21 time 14:45
 */

public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
