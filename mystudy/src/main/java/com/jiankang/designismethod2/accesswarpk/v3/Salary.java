package com.jiankang.designismethod2.accesswarpk.v3;

/*
 *@create by jiankang
 *@date 2020/1/12 time 19:59
 */

public class Salary extends AbsColleague implements ISalary {
    public Salary(AbsMediator mediator) {
        super(mediator);
    }


    @Override
    public void increaseSalary() {
        super.mediator.up(this);
    }

    @Override
    public void decreaseSalary() {
        super.mediator.down(this);
    }
}
