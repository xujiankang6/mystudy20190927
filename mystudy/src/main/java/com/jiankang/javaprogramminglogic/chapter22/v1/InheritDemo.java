package com.jiankang.javaprogramminglogic.chapter22.v1;

/*
 *@create by jiankang
 *@date 2020/5/19 time 13:34
 */

import java.util.Arrays;

public class InheritDemo {
    public static void main(String[] args) {
        System.out.println(Child.class.isAnnotationPresent(Test.class));
        System.out.println(Arrays.toString(Child.class.getAnnotations()));
    }


}
