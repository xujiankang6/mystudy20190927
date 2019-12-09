package com.jiankang.designismethod2.visitorpattern.v4;

/*
 *@create by jiankang
 *@date 2019/12/9 time 19:34
 */

public class Client {
    public static void main(String[] args) {
        AbsActor actor = new OldActor();
        Role role = new KungFuRole();
        //开始演戏
        role.accept(actor);
    }
}
