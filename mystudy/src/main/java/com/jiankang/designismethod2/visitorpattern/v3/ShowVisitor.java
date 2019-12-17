package com.jiankang.designismethod2.visitorpattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/9 time 16:49
 */

public class ShowVisitor implements IShowVisitor {

    private String info = "";

    //打印出报表
    public void report() {
        System.out.println(this.info);
    }

    //访问普通员工，组装信息
    public void visit(CommonEmployee commonEmployee) {
        this.info = this.info + this.getBasicInfo(commonEmployee)
                + "工作：" + commonEmployee.getJob() + "\t\n";
    }

    //访问经理，然后组装信息
    public void visit(Manager manager) {
        this.info = this.info + this.getBasicInfo(manager) + "业绩： " + manager.getPerformance();
    }

    //组装出基本信息
    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMALE ? "女" :
                "男") + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";
        return info;
    }
}
