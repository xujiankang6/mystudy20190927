package com.jiankang.designismethod2.statuspattern;

/*
 *@create by jiankang
 *@date 2019/12/9 time 20:27
 */

public class Lift implements ILift {
    @Override
    public void open() {
        System.out.println("open");
    }

    @Override
    public void close() {
        System.out.println("close");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
