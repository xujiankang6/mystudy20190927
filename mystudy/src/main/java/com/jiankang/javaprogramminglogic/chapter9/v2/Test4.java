package com.jiankang.javaprogramminglogic.chapter9.v2;

import java.util.ArrayList;

/*
 *@create by jiankang
 *@date 2020/4/4 time 21:16
 */

public class Test4 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList(10);
        list.ensureCapacity(100);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

    }
}
