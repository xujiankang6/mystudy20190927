package com.jiankang.improvejava151suggests.chapter2.v8;

/*
 *@create by jiankang
 *@date 2020/11/15 @time 12:24
 */

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/15   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class Client2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("张三", 100);
        Employee e2 = new Employee("张三", 1100);
        Person p1 = new Person("张三");
        System.out.println(e1.equals(p1));
        System.out.println(p1.equals(e2));
        System.out.println(e1.equals(e2));
    }
}
