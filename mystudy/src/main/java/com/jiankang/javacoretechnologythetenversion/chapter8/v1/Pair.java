package com.jiankang.javacoretechnologythetenversion.chapter8.v1;

/*
 *@create by jiankang
 *@date 2020/6/16 time 11:07
 */

import java.util.function.Supplier;

public class Pair<T> {
    private  T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }


    public Pair() {
        first = null;
        second = null;
    }


    public static <T> Pair<T> makePair(Supplier<T> constr) {
        return new Pair<>(constr.get(), constr.get());
    }

    public static <T> Pair<T> makePair2(Class<T> cl) {
        try {
            return new Pair<>(cl.newInstance(),cl.newInstance());
        }catch (Exception e){
            return null;
        }
    }

    public  T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }


}
