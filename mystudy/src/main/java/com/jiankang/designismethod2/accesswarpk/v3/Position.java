package com.jiankang.designismethod2.accesswarpk.v3;

/*
 *@create by jiankang
 *@date 2020/1/12 time 19:59
 */

public class Position extends AbsColleague implements IPosition {
    public Position(AbsMediator mediator) {
        super(mediator);
    }

    @Override
    public void promote() {
        super.mediator.up(this);
    }

    @Override
    public void demote() {
        super.mediator.down(this);
    }
}
