package com.jiankang.designismethod2.accesswarpk.v3;

/*
 *@create by jiankang
 *@date 2020/1/12 time 19:59
 */

public class Tax extends AbsColleague implements ITax {
    public Tax(AbsMediator mediator) {
        super(mediator);
    }


    @Override
    public void raise() {

        super.mediator.up(this);
    }

    @Override
    public void drop() {
        super.mediator.down(this);
    }
}
