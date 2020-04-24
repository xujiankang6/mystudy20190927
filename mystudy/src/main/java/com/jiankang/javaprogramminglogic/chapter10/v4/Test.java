package com.jiankang.javaprogramminglogic.chapter10.v4;

/*
 *@create by jiankang
 *@date 2020/4/9 time 10:45
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(Arrays.asList("tree", "map", "hash", "map"));
        System.out.println(words);
        System.out.println("-----------加入Comparator排序器--------");
        TreeSet<String> strings = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        strings.addAll(Arrays.asList("tree", "map", "hash", "map"));
        System.out.println(strings);
    }
}
