package com.jiankang.effectivejavasecondedition.chapter2;

/*
 *@create by jiankang
 *@date 2019/12/27 time 15:36
 */

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Boolean a = Test.valueOf(false);
        System.out.println(a);
        List<Object> objects = Collections.emptyList();


    }


    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }


}
