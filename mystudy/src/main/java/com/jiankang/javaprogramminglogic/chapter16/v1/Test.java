package com.jiankang.javaprogramminglogic.chapter16.v1;

/*
 *@create by jiankang
 *@date 2020/5/3 time 10:33
 */

import com.jiankang.javaprogramminglogic.chapter8.v1.Pair;

import java.util.concurrent.atomic.AtomicStampedReference;

public class Test {
    public static void main(String[] args) {
        Pair pair = new Pair(100,200);
        int stamp =1;
        AtomicStampedReference<Pair> pairAtomicStampedReference = new AtomicStampedReference<>(pair, stamp);
        int newStamp = 2;
        boolean b = pairAtomicStampedReference.compareAndSet(pair, new Pair(100, 200), stamp, newStamp);
        System.out.println(b);
    }
}
