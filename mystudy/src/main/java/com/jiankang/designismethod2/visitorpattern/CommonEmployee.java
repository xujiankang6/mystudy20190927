package com.jiankang.designismethod2.visitorpattern;

/*
 *@create by jiankang
 *@date 2019/12/4 time 18:04
 */

public class CommonEmployee extends Employee {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    protected String getOtherInfo() {
        return "工作：" + this.job + "\t";
    }
}
