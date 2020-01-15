package com.jiankang.designismethod2.accesswarpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/12 time 20:49
 */

import java.util.Random;

public class Performance {
    private BasicSalary salary = new BasicSalary();


    public int getPerformanceValue() {
        int perf = (new Random()).nextInt(100);
        return salary.getBasicSalary() * perf / 100;
    }
}
