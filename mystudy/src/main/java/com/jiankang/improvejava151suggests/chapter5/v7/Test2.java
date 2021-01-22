package com.jiankang.improvejava151suggests.chapter5.v7;

/*
 *@create by jiankang
 *@date 2020/11/11 @time 19:30
 */

import java.util.ArrayList;
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


public class Test2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        List<String> list2 = new ArrayList<>();
        list2.add("C");
        list2.add("B");
        list1.addAll(list2);
        System.out.println(list1);
        list1.retainAll(list2);
        System.out.println(list1);
        list1.removeAll(list2);
        System.out.println(list1);


    }
}
