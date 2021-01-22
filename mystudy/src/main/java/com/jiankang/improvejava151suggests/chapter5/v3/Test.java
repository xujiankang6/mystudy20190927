package com.jiankang.improvejava151suggests.chapter5.v3;

/*
 *@create by jiankang
 *@date 2020/11/10 @time 19:36
 */

import java.util.Arrays;
import java.util.List;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/10   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */
public class Test {

    public static void main(String[] args) {
        //在把基本类型数组转化为列表时，要特别消息asList的陷阱
        int[] data = {1, 2, 3, 4, 5};
        List list = Arrays.asList(data);
        System.out.println(list.get(0).getClass());
        System.out.println(data.equals(list.get(0)));
        System.out.println(list.size());

        Integer[] data1 = {1, 2, 3, 4, 5};
        List list1 = Arrays.asList(data1);
        System.out.println(list1.get(0).getClass());
        System.out.println(data1.equals(list.get(0)));
        System.out.println(list1.size());

    }
}
