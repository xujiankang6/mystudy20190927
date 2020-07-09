package com.jiankang.javacoretechnologythetenversion.dchapter1.v5;

/*
 *@create by jiankang
 *@date 2020/7/9 time 12:08
 */

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends SerialCloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();

    }

    public void setHireDay(int year, int month, int day) {
        Date time = new GregorianCalendar(year, month - 1, day).getTime();
        hireDay.setTime(time.getTime());
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary+=raise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
