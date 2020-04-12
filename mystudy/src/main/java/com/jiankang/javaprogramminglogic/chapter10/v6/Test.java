package com.jiankang.javaprogramminglogic.chapter10.v6;

/*
 *@create by jiankang
 *@date 2020/4/9 time 15:47
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//跟同事交流学到的集合转数组方法
public class Test {
    public static void main(String[] args) {
        List<Object> a = new ArrayList<>();
        a.add("1");
        String[] array =  a.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
    }
}
