package com.jiankang.improvejava151suggests.chapter7.v4;

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


        //强制声明泛型类型
        List<Integer> list3 = ArrayUtils.<Integer>asList();
        List<Number> numbers = ArrayUtils.<Number>asList(1, 23, 2.1);


        List<Long> longs = Arrays.<Long>asList(1l,2l);
        System.out.println();
        list3.add(3);


    }
}
