package com.jiankang.designismethod2.accesswarpk.v4;

/*
 *@create by jiankang
 *@date 2020/1/12 time 21:01
 */

public class SalaryProvider {
    private BasicSalary basicSalary = new BasicSalary();
    private Bonus bonus = new Bonus();
    private Performance performance = new Performance();
    private Tax tax = new Tax();

    public int totalSalary() {
        return basicSalary.getBasicSalary() + bonus.getBonus() + performance.getPerformanceValue() - tax.getTax();
    }
}
