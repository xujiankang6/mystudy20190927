package com.jiankang.designismethod2.visitorpattern;

/*
 *@create by jiankang
 *@date 2019/12/4 time 18:06
 */

public class Manager extends Employee {
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    protected String getOtherInfo() {
        return "业绩：" + this.performance + "\t";
    }
}
