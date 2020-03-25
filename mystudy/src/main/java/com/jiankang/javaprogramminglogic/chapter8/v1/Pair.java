package com.jiankang.javaprogramminglogic.chapter8.v1;

/*
 *@create by jiankang
 *@date 2020/3/24 time 19:11
 */

public class Pair<U,V> {
    U first;
    V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public void setFirst(U first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}
