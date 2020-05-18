package com.jiankang.javaprogramminglogic.chapter16.v1;

/*
 *@create by jiankang
 *@date 2020/5/3 time 10:28
 */

import java.util.concurrent.atomic.AtomicInteger;

public class MyLock {
    private AtomicInteger status = new AtomicInteger(0);

    public void lock() {
        while (!status.compareAndSet(0, 1)) {
            Thread.yield();
        }
    }

    public void unlock() {
        status.compareAndSet(1, 0);
    }
}
