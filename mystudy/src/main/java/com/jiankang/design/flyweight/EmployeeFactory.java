package com.jiankang.design.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    private final static Map<String, Employee> EMPLOYEE_MAP = new HashMap<String, Employee>();


    public static Employee getEmployee(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            manager.setReportContent(department + " 报告的内容是。。。。");
            EMPLOYEE_MAP.put(department, manager);
            System.out.print("创建部门经理：" + department);
        }
        return manager;

    }


}
