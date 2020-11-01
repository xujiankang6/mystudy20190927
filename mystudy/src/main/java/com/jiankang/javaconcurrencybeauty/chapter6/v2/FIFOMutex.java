package com.jiankang.javaconcurrencybeauty.chapter6.v2;

/*
 *@create by jiankang
 *@date 2020/10/23 time 10:43
 * 不明白，能力有限
 */

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

public class FIFOMutex {
    private final AtomicBoolean locked = new AtomicBoolean(false);
    private final Queue<Thread> waiters = new ConcurrentLinkedDeque<Thread>();


    public static void main(String[] args) {
         FIFOMutex fifoMutex = new FIFOMutex();
         fifoMutex.lock();
         fifoMutex.lock();
         fifoMutex.unlock();
    }

    public void lock(){
        boolean wasInterrupted = false;
        Thread current = Thread.currentThread();
        waiters.add(current);
        while (waiters.peek()!=null || !locked.compareAndSet(false,true)){
            LockSupport.park(this);
            if(Thread.interrupted()){
                wasInterrupted=true;
            }
        }
        waiters.remove();
        if(wasInterrupted){
            current.interrupt();
        }
    }

    public void unlock(){
        locked.set(false);
        LockSupport.unpark(waiters.peek());
    }


}
