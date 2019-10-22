package com.jiankang.thinkinginjava;

/*
 *@create by jiankang
 *@date 2019/10/17 time 21:25
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utilities {
    static List<String> list = Arrays.asList("one two three four five six one".split(" "));

    public static void main(String[] args) {
        System.out.println(list);
        System.out.println(Collections.disjoint(list,Collections.singleton("Four")));
        System.out.println(Collections.max(list));
    }
}
