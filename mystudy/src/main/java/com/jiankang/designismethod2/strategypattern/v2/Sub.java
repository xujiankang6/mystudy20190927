package com.jiankang.designismethod2.strategypattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/21 time 15:12
 */

public class Sub implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a-b;
    }
}
