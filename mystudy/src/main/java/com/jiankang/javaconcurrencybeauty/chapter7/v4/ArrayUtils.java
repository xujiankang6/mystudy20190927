package com.jiankang.javaconcurrencybeauty.chapter7.v4;

/*
 *@create by jiankang
 *@date 2020/10/30 time 12:35
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtils {

    public static <T> List<T> asList(T... t) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, t);
        return list;
    }

    public static void main(String[] args) {
         List<String> list = ArrayUtils.asList("A", "B");
        List<Object> list2 = ArrayUtils.asList();
        Arrays.asList("a");


    }
}
