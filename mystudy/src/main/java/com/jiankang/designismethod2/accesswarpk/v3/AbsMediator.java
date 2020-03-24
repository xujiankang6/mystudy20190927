package com.jiankang.designismethod2.accesswarpk.v3;

/*
 *@create by jiankang
 *@date 2020/1/12 time 19:57
 */

public abstract class AbsMediator {
    protected ISalary salary;
    protected ITax tax;
    protected IPosition position;

    public AbsMediator() {
        salary = new Salary(this);
        tax = new Tax(this);
        position = new Position(this);
    }

    public abstract void up(ISalary salary);

    public abstract void down(ISalary salary);

    public abstract void up(ITax tax);

    public abstract void down(ITax tax);

    public abstract void up(IPosition position);

    public abstract void down(IPosition position);


}
