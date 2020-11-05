package com.jiankang.improvejava151suggests.chapter9.v6;

/*
 *@create by jiankang
 *@date 2020/11/4 time 20:57
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TaskWithLock extends Task implements Runnable {
    private final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            lock.lock();
            doSomething();
        } finally {
            lock.unlock();
        }
    }
}
