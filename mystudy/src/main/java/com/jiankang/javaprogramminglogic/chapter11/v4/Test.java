package com.jiankang.javaprogramminglogic.chapter11.v4;

/*
 *@create by jiankang
 *@date 2020/4/17 time 13:52
 */


import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Median<Integer> median = new Median<>();
        List<Integer> integers = Arrays.asList(new Integer[]{
                34, 90, 67, 1, 4, 45, 5, 6, 7, 9, 10
        });
        median.addAll(integers);
        System.out.println(median.getM());
    }
}
