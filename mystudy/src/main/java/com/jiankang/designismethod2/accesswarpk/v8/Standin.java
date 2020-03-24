package com.jiankang.designismethod2.accesswarpk.v8;

/*
 *@create by jiankang
 *@date 2020/1/13 time 9:59
 */

public class Standin implements IStar {
    private IActor actor;


    public Standin(IActor actor) {
        this.actor = actor;
    }

    @Override
    public void act(String context) {
        actor.playact(context);
    }
}
