package com.jiankang.designismethod2.visitorpattern.v1;

/*
 *@create by jiankang
 *@date 2019/12/4 time 18:33
 */

public class CommonEmployee extends Employee {

    //工作内容，这非常重要，以后的职业规划就是靠它了
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
