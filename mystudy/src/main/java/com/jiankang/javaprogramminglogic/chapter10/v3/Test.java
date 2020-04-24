package com.jiankang.javaprogramminglogic.chapter10.v3;

/*
 *@create by jiankang
 *@date 2020/4/8 time 17:27
 */

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        //自定义排序treeMap
//        TreeMap<Object, Object> map = new TreeMap<>(new Comparator<Object>() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                String o11 = (String) o1;
//                String o22 = (String) o2;
//                return o11.compareToIgnoreCase(o22);
//            }
//        });
        TreeMap<String, Object> map1 = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        TreeMap<String, Object> map = new TreeMap<>(Collections.reverseOrder());
        map.put("a", "abstract");
        map.put("c", "call");
        map.put("b", "basic");
        map.put("T", "tree");
        for (Map.Entry k : map.entrySet()) {
            System.out.println(k.getKey() + "  " + k.getValue());
        }
    }
}
