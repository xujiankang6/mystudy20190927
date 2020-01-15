package com.jiankang.designismethod2.createclasspatternpk.v4;

/*
 *@create by jiankang
 *@date 2019/12/31 time 17:16
 */

public class BenzBuilder extends CarBuilder {
    @Override
    protected String buildWheel() {
        return super.getBp().getWheel();
    }

    @Override
    protected String buildEngine() {
        return super.getBp().getEngine();
    }
}
