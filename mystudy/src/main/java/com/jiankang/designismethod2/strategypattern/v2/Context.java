package com.jiankang.designismethod2.strategypattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/21 time 15:12
 */

import com.jiankang.designismethod2.strategypattern.v1.Strategy;

public class Context {
    private Calculator calculator = null;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }

    public int exec(int a, int b, String symbol){
        return this.calculator.exec(a,b);
    }

}
