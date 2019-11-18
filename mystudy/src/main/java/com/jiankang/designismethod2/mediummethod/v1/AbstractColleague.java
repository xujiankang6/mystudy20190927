package com.jiankang.designismethod2.mediummethod.v1;

/*
 *@create by jiankang
 *@date 2019/11/15 time 13:37
 */

public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator _mediator){
        this.mediator = _mediator;
    }
}
