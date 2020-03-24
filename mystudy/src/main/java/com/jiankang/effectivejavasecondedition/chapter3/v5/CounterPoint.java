package com.jiankang.effectivejavasecondedition.chapter3.v5;

/*
 *@create by jiankang
 *@date 2020/1/9 time 17:59
 */

import java.util.concurrent.atomic.AtomicInteger;

public class CounterPoint extends Point {
    private static final AtomicInteger counter = new AtomicInteger();

    public CounterPoint(int x, int y) {
        super(x, y);
        counter.incrementAndGet();
    }

    public int numberCreated() {
        return counter.get();
    }
}
