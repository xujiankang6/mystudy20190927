package com.jiankang.improvejava151suggests.chapter5.v5;

/*
 *@create by jiankang
 *@date 2020/11/11 @time 11:36
 * 判断集合相等只需关注元素是否相等
 */

import java.util.ArrayList;
import java.util.LinkedList;


public class Test {
    public static void main(String[] args) {
        final ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        final LinkedList<String> strings1 = new LinkedList<>();
        strings1.add("1");

        System.out.println(strings.equals(strings1));

    }
}
