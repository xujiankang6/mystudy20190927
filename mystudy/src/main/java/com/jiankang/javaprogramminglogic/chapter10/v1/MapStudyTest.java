package com.jiankang.javaprogramminglogic.chapter10.v1;

/*
 *@create by jiankang
 *@date 2020/3/27 time 14:46
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStudyTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, 1);
        map.put(2, 1);
        map.put(3, 1);

        //注意，下面方法返回的是视图，修改后会直接修改map自身
        Set set = map.keySet();
        set.clear();
        Set set1 = map.keySet();
        System.out.println(set1.size());
    }
}
