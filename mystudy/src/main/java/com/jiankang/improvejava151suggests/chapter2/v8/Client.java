package com.jiankang.improvejava151suggests.chapter2.v8;

/*
 *@create by jiankang
 *@date 2020/11/15 @time 12:11
 */

import java.util.ArrayList;
import java.util.List;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/15   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class Client {
    public static void main(String[] args) {
        Person p1 = new Person("张三");
        Person p2 = new Person("张三 ");
        Person p3 = new Person(null);
        List<Person> l = new ArrayList<Person>();
        l.add(p1);
        l.add(p2);
        l.add(p3);
        System.out.println(l.contains(p1));
        System.out.println(l.contains(p2));
        System.out.println(l.contains(p3));
    }
}
