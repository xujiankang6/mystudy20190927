package com.jiankang.javaprogramminglogic.chapter16.v2;

/*
 *@create by jiankang
 *@date 2020/5/3 time 11:20
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private final Lock lock = new ReentrantLock();
    private volatile int count;

    public void incr() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }


    public int getCount() {
        return count;
    }
}
