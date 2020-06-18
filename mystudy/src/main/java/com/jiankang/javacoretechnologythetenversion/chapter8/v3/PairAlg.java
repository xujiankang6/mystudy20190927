package com.jiankang.javacoretechnologythetenversion.chapter8.v3;

/*
 *@create by jiankang
 *@date 2020/6/18 time 8:41
 */

import com.jiankang.javacoretechnologythetenversion.chapter8.v1.Pair;

public class PairAlg {
    public static boolean hasNulls(Pair<?> p) {
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(Pair<?> p) {
        swapHelper(p);

    }

    public static <T> void swapHelper(Pair<T> p) {
        T first = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(first);
    }
}
