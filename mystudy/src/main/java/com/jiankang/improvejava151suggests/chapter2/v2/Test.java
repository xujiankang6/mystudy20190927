package com.jiankang.improvejava151suggests.chapter2.v2;

/*
 *@create by jiankang
 *@date 2020/11/13 @time 15:56
 */

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/13   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class Test {
    public static void main(String[] args) {
        Person p = new Person("aaa",new Person.Home("shanhai","1111"));
        System.out.println(p.getHome().getAddress());

    }
}
