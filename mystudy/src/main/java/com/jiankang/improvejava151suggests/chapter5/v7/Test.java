package com.jiankang.improvejava151suggests.chapter5.v7;

/*
 *@create by jiankang
 *@date 2020/11/11 @time 19:00
 */

import java.util.ArrayList;
import java.util.Collections;
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
        List<String> cities = new ArrayList<String>();
        cities.add("上海");
        cities.add("广州");
        cities.add("广州");
        cities.add("北京");
        cities.add("天津");
        cities.add("上海");
        int index1 = cities.indexOf("广州");
        //二分查找，是面对排序好的列表的，否则不准
//        必须先排序
        int index2 = Collections.binarySearch(cities, "广州");
        System.out.println(index1);
        System.out.println(index2);

        //建议76：实现了compareTo方法，就应该复写
    }
}
