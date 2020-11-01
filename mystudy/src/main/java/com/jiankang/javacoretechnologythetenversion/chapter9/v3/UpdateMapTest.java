package com.jiankang.javacoretechnologythetenversion.chapter9.v3;

/*
 *@create by jiankang
 *@date 2020/6/20 time 15:42
 */

import java.util.HashMap;
import java.util.Map;

public class UpdateMapTest {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap();
        String word = "a";

        //会有问题，当get（word）为空时
        m.put(word,m.get(word)+1);
        //法一、
        m.put(word,m.getOrDefault(word,0)+1);
        //法二、
        m.putIfAbsent(word,0);
        m.put(word,m.get(word)+1);
        //法三、
        m.merge(word,1,Integer::sum);
    }
}
