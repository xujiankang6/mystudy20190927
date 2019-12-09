package com.jiankang.designismethod2.visitorpattern.v4;

/*
 *@create by jiankang
 *@date 2019/12/9 time 18:20
 */

public class OldActor extends AbsActor {
    @Override
    public void act(KungFuRole role) {
        System.out.println("年龄大了，不能演奏了");
    }
}
