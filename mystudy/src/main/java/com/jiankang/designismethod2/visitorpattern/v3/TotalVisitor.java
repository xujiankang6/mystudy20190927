package com.jiankang.designismethod2.visitorpattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/9 time 17:09
 */

public class TotalVisitor implements ITotalVisitor {
    //部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;
    //员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEEFICIENT = 2;
    //普通员工的工资总和
    private int commonTotalSalary = 0;
    //部门经理的工资总和
    private int managerTotalSalary = 0;

    //    计算部门经理的工资总和
    private void calManagerSalary(int salary) {
        this.managerTotalSalary = this.managerTotalSalary + salary * MANAGER_COEFFICIENT;
    }

    //计算普通员工的工资总和
    private void calCommonSalary(int salary) {
        this.commonTotalSalary = this.commonTotalSalary + salary * COMMONEMPLOYEE_COEEFICIENT;
    }

    //获得所有员工的工资总和
    @Override
    public void totalSalary() {

        System.out.println("本公司的月工资总额是" + (this.commonTotalSalary +
                this.managerTotalSalary));
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        calCommonSalary(commonEmployee.getSalary());


    }

    @Override
    public void visit(Manager manager) {
        calManagerSalary(manager.getSalary());

    }


}
