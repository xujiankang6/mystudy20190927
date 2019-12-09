package com.jiankang.designismethod2.visitorpattern.v4;

/*
 *@create by jiankang
 *@date 2019/12/9 time 18:15
 */

public class KungFuRole implements Role {
    @Override
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
