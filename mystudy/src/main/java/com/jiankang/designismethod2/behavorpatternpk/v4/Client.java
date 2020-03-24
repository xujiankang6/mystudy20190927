package com.jiankang.designismethod2.behavorpatternpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/6 time 20:16
 */

public class Client {
    public static void main(String[] args) {
        Human humanState = new Human();
        humanState.setState(Human.CHILD_STATE);

        humanState.work();
        humanState.work();
        humanState.work();
        humanState.work();
        humanState.work();
    }
}
