package com.jiankang.javaconcurrencybeauty.chapter6.v4;

/*
 *@create by jiankang
 *@date 2020/10/25 time 14:30
 * 使用ReentrantLock 实现线程安全的list
 */

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockList {
    //    线程不安全的list
    private ArrayList<String> array = new ArrayList<>();
    //独占锁
    private volatile ReentrantLock lock = new ReentrantLock();

    //添加元素
    public void add(String e) {
        lock.lock();
        try {
            array.add(e);
        } finally {
            lock.unlock();
        }
    }

    //删除元素
    public void remove(String e) {
        lock.lock();
        try {
            array.remove(e);
        } finally {
            lock.unlock();
        }
    }

    //获取元素
    public String get(int index) {
        lock.lock();
        try {
            return array.get(index);
        } finally {
            lock.unlock();
        }
    }

}
