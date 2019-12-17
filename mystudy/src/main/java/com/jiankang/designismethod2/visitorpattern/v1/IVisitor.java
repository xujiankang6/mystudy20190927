package com.jiankang.designismethod2.visitorpattern.v1;


public interface IVisitor {
    //首先，定义我可以访问普通员工
    public void visit(CommonEmployee commonEmployee);

    //定义可以访问部门经理
    public void visit(Manager manager);

    //统计所有员工工资总和
    public int getTotalSalary();
}
