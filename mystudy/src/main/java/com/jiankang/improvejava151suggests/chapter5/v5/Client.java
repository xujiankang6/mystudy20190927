package com.jiankang.improvejava151suggests.chapter5.v5;

/*
 *@create by jiankang
 *@date 2020/11/11 @time 16:57
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
public class Client {
    public static void main(String[] args) {
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("B");
        List<String> c1 = new ArrayList<>(c);
        //subList产生的列表只是一个视图，所有的修改动作直接作用于原列表
        List<String> c2 = c.subList(0, 1);
        c2.add("C");

        System.out.println(c.equals(c1));
        System.out.println(c.equals(c2));



        String str = "AB";
        String str1 = new String(str);
        String str2 = str.substring(0)+"C";
        System.out.println(str1.equals(str));
        System.out.println(str.equals(str2));
    }
}
