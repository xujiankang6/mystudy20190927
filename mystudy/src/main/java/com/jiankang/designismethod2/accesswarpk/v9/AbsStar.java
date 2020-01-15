package com.jiankang.designismethod2.accesswarpk.v9;

/*
 *@create by jiankang
 *@date 2020/1/13 time 10:14
 */

public abstract class AbsStar {
    private final AbsAction absAction;

    public AbsStar(AbsAction absAction) {
        this.absAction = absAction;
    }

    public void doJob(){
        absAction.desc();
    }
}
