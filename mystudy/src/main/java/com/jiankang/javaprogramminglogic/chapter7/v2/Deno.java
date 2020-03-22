package com.jiankang.javaprogramminglogic.chapter7.v2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Deno
 *
 * @author jiankang.xu
 * @date 2020/3/22
 */
public class Deno {
    public static void main(String[] args) {
        String[] arr = {"hello", "world", "Break", "abc"};
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = o1.toString().toLowerCase();
                String s2 = o2.toString().toLowerCase();
                return s1.compareTo(s2);
            }
        };
        //忽略大小写比较
        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(arr));
        //逆序比较
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareToIgnoreCase(o1);
            }
        });
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        System.out.println(Arrays.toString(arr));
    }
}
