package com.jiankang.javaprogramminglogic.chapter10.v3;

/*
 *@create by jiankang
 *@date 2020/4/8 time 17:40
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>(new Comparator<String>() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

            @Override
            public int compare(String o1, String o2) {
                try {
                    return simpleDateFormat.parse(o1).compareTo(simpleDateFormat.parse(o2));
                } catch (ParseException e) {
                    e.printStackTrace();
                    return 0;
                }
            }
        });
        map.put("2016-7-3", 100);
        map.put("2016-7-10", 120);
        map.put("2016-8-1", 90);
        for (Map.Entry k : map.entrySet()) {
            System.out.println(k.getKey() + "  " + k.getValue());
        }
    }
}
