package com.jiankang.designismethod2.createclasspatternpk.v4;

/*
 *@create by jiankang
 *@date 2019/12/31 time 17:07
 */

public abstract class CarBuilder {
    private ICar car;
    //设计蓝图
    private Blueprint bp;

    public Car buildCar() {
        return new Car(buildEngine(), buildWheel());
    }

    public Blueprint getBp() {
        return bp;
    }

    public void setBp(Blueprint bp) {
        this.bp = bp;
    }

    protected abstract String buildWheel();

    protected abstract String buildEngine();

}
