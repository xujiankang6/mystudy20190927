package com.jiankang.designismethod2.accesswarpk.v3;

/*
 *@create by jiankang
 *@date 2020/1/12 time 19:53
 */

public abstract class AbsColleague {

    protected  AbsMediator mediator;

    public AbsColleague(AbsMediator mediator) {
        this.mediator = mediator;
    }
}
