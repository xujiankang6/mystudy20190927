package com.jiankang.designismethod2.behavorpatternpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/6 time 20:10
 */

public abstract class HumanState {

    protected Human human;

    void setHuman(Human human) {
        this.human = human;
    }

    public abstract void work();
}
