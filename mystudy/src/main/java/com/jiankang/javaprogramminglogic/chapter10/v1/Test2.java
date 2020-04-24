package com.jiankang.javaprogramminglogic.chapter10.v1;

/*
 *@create by jiankang
 *@date 2020/3/27 time 14:55
 */

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        //HashMap支持键值为null
        Map map = new HashMap();
        map.put(null, 1);
        map.put(null, 11);
        Object o = map.get(null);
        System.out.println(o);
    }
}
