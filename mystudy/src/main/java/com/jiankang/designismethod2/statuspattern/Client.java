package com.jiankang.designismethod2.statuspattern;

/*
 *@create by jiankang
 *@date 2019/12/9 time 20:28
 */

public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
