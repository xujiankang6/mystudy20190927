package com.jiankang.javacoretechnologythetenversion.chapter9.v1;

/*
 *@create by jiankang
 *@date 2020/6/20 time 13:14
 */

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.iterator().forEachRemaining(e -> System.out.println(e+10));
    }
}
