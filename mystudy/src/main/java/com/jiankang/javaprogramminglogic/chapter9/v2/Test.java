package com.jiankang.javaprogramminglogic.chapter9.v2;

/*
 *@create by jiankang
 *@date 2020/3/26 time 9:41
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //arrayList返回数组
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        String[] arrA = new String[3];
        String[] strings = list.toArray(arrA);
        String[] arrB = list.toArray(new String[0]);
        System.out.println(Arrays.equals(arrA, arrB));
        System.out.println(Arrays.toString(arrA));
        System.out.println(Arrays.toString(arrB));
        System.out.println(arrA.length);
        System.out.println(arrB.length);

    }
}
