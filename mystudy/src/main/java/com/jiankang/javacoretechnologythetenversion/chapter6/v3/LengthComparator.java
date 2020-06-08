package com.jiankang.javacoretechnologythetenversion.chapter6.v3;

/*
 *@create by jiankang
 *@date 2020/6/6 time 10:29
 */

import java.util.Arrays;
import java.util.Comparator;

public class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        return first.length()-second.length();
    }


    public static void main(String[] args) {
        String[] friends = {"Peter1","Paul","Mary1"};
        Arrays.sort(friends,new LengthComparator());
        System.out.println(Arrays.toString(friends));

    }
}
