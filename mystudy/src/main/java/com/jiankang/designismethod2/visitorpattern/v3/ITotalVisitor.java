package com.jiankang.designismethod2.visitorpattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/9 time 17:08
 */

public interface ITotalVisitor extends IVisitor {
    //统计所有员工的工资总和
    public void totalSalary();
}
