package com.jiankang.javaprogramminglogic.chapter11.v3;

/*
 *@create by jiankang
 *@date 2020/4/17 time 13:39
 */

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        TopK<Integer> top5 = new TopK<>(5);
        top5.addAll(Arrays.asList(new Integer[]{
                100,1,2,1,4,3,3,5,1001 ,1111
        }));
        System.out.println(Arrays.toString(top5.toArray(new Integer[0])));
        System.out.println(top5.getKth());
    }
}
