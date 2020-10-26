package com.jiankang.javaconcurrencybeauty.chapter6.v4;

/*
 *@create by jiankang
 *@date 2020/10/25 time 14:30
 * 使用ReentrantReadWriteLockList实现线程安全的list , 提供读多写少的性能
 */

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockList {
    //    线程不安全的list
    private ArrayList<String> array = new ArrayList<>();
    //独占锁
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();


    //添加元素
    public void add(String e) {
        writeLock.lock();
        try {
            array.add(e);
        } finally {
            writeLock.unlock();
        }
    }

    //删除元素
    public void remove(String e) {
        writeLock.lock();
        try {
            array.remove(e);
        } finally {
            writeLock.unlock();
        }
    }

    //获取元素
    public String get(int index) {
        readLock.lock();
        try {
            return array.get(index);
        } finally {
            readLock.unlock();
        }
    }

}
