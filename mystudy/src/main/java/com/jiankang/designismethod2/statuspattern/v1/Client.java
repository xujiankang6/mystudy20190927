package com.jiankang.designismethod2.statuspattern.v1;

/*
 *@create by jiankang
 *@date 2019/12/9 time 21:10
 */

public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.setState(ILift.STOPPING_STATE);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
        lift.stop();
    }
}
