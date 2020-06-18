package com.jiankang.javacoretechnologythetenversion.chapter8.v1;

/*
 *@create by jiankang
 *@date 2020/6/11 time 18:48
 */

import java.io.Serializable;
import java.util.Collection;

public class ArrayAlg {

    public static <T extends Comparable & Serializable> T min(T[] a) {
        if (a == null || a.length == 0) return null;
        T smallest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (smallest.compareTo(a[i]) > 0) smallest = a[i];
        }
        return smallest;
    }


    //泛型方法
    public static <T> T getMiddle(T[] a) {
        return a[a.length / 2];
    }


    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }


    //泛型最大最小值方法
    public static <T extends Comparable> Pair<T> minmaxT(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }

    @SafeVarargs
    public static <T> void addAll(Collection<T> coll, T... ts) {
        for (T t : ts) {
            coll.add(t);
        }
    }

    //不报错，但是会报错cannot be cast to [Ljava.lang.Comparable,展示不能构造泛型数组实例方法
    public static <T extends Comparable> T[] minmax(T... a) {
        Object[] mn = new Object[2];
        return (T[]) mn;
    }


    //抛出异常方法
    public static <T extends Throwable> void doWork(T t) throws T {
        try {

        } catch (Throwable e) {
            t.initCause(e);
            throw t;
        }
    }


}
