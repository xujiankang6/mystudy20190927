package com.jiankang.javaprogramminglogic.chapter10.v5;

/*
 *@create by jiankang
 *@date 2020/4/9 time 14:03
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //访问有序，每次访问都会将该键值对移到末尾
        Map<String, Integer> accessMap = new LinkedHashMap<>(16, 0.75f, true);
        accessMap.put("c", 100);
        accessMap.put("d", 200);
        accessMap.put("a", 500);
        accessMap.get("c");
        accessMap.put("d", 300);
        for (Map.Entry<String, Integer> entry : accessMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
