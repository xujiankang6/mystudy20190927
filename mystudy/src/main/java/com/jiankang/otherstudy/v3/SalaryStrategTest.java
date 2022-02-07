package com.jiankang.otherstudy.v3;

/**
 * SalaryStrategTest
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
public class SalaryStrategTest {
    public static void main(String[] args) {
        SalaryStrategyEnum salaryStrategyEnum = SalaryStrategyEnum.valueOf(0);
        double salary = salaryStrategyEnum.getSalary();
        System.out.println(salary);
        String name = salaryStrategyEnum.name();
        System.out.println(name);
    }
}
