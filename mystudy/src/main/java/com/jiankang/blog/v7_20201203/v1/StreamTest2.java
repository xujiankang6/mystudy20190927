package com.jiankang.blog.v7_20201203.v1;

/*
 *@create by jiankang
 *@date 2020/12/3 @time 19:00
 */

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/12/3   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class StreamTest2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 6, 3, 4, 6, 7, 9, 6, 20);

        Set<Integer> listNew = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
        System.out.println(listNew);
    }
}
