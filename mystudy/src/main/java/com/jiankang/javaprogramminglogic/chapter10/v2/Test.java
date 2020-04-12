package com.jiankang.javaprogramminglogic.chapter10.v2;

/*
 *@create by jiankang
 *@date 2020/4/8 time 16:23
 */

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Spec> specs = new HashSet<>();
        specs.add(new Spec("M","red"));
        specs.add(new Spec("M","red"));
        System.out.println(specs);
    }
}
