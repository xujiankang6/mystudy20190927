package com.jiankang.javaprogramminglogic.chapter8.v1;

/*
 *@create by jiankang
 *@date 2020/3/24 time 20:08
 */

public class NumberPair<U extends Number, V extends Number> extends Pair<U, V> {
    public NumberPair(U first, V second) {
        super(first, second);
    }

    public double sum() {
        return getFirst().doubleValue() + getSecond().doubleValue();
    }

}
