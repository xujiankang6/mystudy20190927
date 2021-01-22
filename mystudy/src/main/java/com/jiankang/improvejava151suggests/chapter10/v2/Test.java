package com.jiankang.improvejava151suggests.chapter10.v2;

/*
 *@create by jiankang
 *@date 2020/11/7 time 13:58
 */

import com.google.common.base.Joiner;
import com.google.common.collect.*;

public class Test {
    public static void main(String[] args) {
         ImmutableMap<String, Integer> of = ImmutableMap.of("my",1);
         ImmutableList<Integer> list = ImmutableList.of(1, 2, 3, 4, 5, 65, 76, 65, 6, 4, 3, 32, 2);

         Multimap<String, Long> phoneMap = ArrayListMultimap.create();
         phoneMap.put("张三",18438595560l);
         phoneMap.put("张三",18438595561l);
         phoneMap.put("张三",18438595562l);
        System.out.println(phoneMap.get("张三"));
        Joiner joiner = Joiner.on(",");
        System.out.println(joiner.join(phoneMap.get("张三")));

        HashBasedTable<Double, Double, String> g = HashBasedTable.create();
         g.put(31.23,121.48,"人民广场");
         //输出坐标点的建筑物
        System.out.println(g.get(31.23, 121.48));

        Table<Integer, Integer, String> user = HashBasedTable.create();
        user.put(1,1,"张三");
        user.put(1,2,"李四");
        System.out.println(user.get(1,1));


    }
}
