package com.jiankang.improvejava151suggests.chapter5.v6;

/*
 *@create by jiankang
 *@date 2020/11/11 @time 18:53
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/11   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */
public class Test {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>(5);
        list.add(new Employee(1001, "张三1", Position.Boss));
        list.add(new Employee(1002, "张三2", Position.Manager));
        list.add(new Employee(1003, "张三3", Position.Staff));
        Collections.sort(list,new PositionComparator());
        Collections.sort(list,Collections.reverseOrder(new PositionComparator()));
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }


}

class PositionComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getPosition().compareTo(o2.getPosition());
    }
}