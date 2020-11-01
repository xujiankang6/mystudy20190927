package com.jiankang.javacoretechnologythetenversion.chapter5.v8;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Employee
 *
 * @author jiankang.xu
 * @date 2020/6/7
 */
public class Employee implements Cloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();

    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();
        employee.hireDay = (Date) hireDay.clone();
        return employee;
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
