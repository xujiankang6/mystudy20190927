package com.jiankang.javacoretechnologythetenversion.chapter14.v6;

/*
 *@create by jiankang
 *@date 2020/6/30 time 14:59
 */

import java.util.concurrent.ThreadLocalRandom;

public class Test {
    public static void main(String[] args) {
        int random = ThreadLocalRandom.current().nextInt();
        ThreadLocal rt =new ThreadLocal();
        Object o = rt.get();
        System.out.println(o);

    }
}
