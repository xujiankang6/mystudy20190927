package com.jiankang.designismethod2.visitorpattern.v3;


public interface IVisitor {
    //首先，定义我可以访问普通员工
    public void visit(CommonEmployee commonEmployee);

    //定义可以访问部门经理
    public void visit(Manager manager);

}
