package com.jiankang.improvejava151suggests.chapter7.v7;

/*
 *@create by jiankang
 *@date 2020/11/1 time 12:36
 */

import java.util.Arrays;
import java.util.List;

public class ArrayTest {


    public static void main(String[] args) {
         List<String> list = Arrays.asList("A", "B");
         String[] strings = toArray(list);
        for (String string : strings) {
            System.out.println(string);
        }

    }

    public static <T> T[] toArray(List<T> list) {
        T[] t = (T[]) new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            t[i] = list.get(i);
        }
        return t;
    }
}
