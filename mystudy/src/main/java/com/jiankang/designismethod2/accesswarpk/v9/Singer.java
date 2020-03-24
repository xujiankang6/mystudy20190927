package com.jiankang.designismethod2.accesswarpk.v9;

/*
 *@create by jiankang
 *@date 2020/1/13 time 11:53
 */

public class Singer extends AbsStar {

    public Singer() {
        super(new ActSing());
    }

    public Singer(AbsAction absAction) {
        super(absAction);
    }

    @Override
    public void doJob() {
        System.out.println("\n============歌星的工作========");
        super.doJob();
    }
}
