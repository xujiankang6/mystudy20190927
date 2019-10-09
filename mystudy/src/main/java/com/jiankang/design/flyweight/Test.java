package com.jiankang.design.flyweight;

import java.util.Random;

public class Test {
    private static final String departments[] = {"RD", "HR", "TQ"};


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Employee employee = EmployeeFactory.getEmployee(department);
            employee.report();
        }
    }
}
