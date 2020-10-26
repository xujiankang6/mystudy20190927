package com.jiankang.javaconcurrencybeauty.chapter6.v3;

/*
 *@create by jiankang
 *@date 2020/10/25 time 13:13
 */

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.Condition;

public class Test {
    final static NonReetrantLock lock = new NonReetrantLock();

    final static Condition notFull = lock.newCondition();
    final static Condition notEmpty = lock.newCondition();
    final static Queue<String> queue = new LinkedBlockingDeque<String>();

    final static int queueSize = 10;

    public static void main(String[] args) {
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    for(;;){
                        Thread.sleep(500);
                    while (queue.size() == queueSize) {
                        notEmpty.await();
                    }
                    queue.add("ele");
                    notFull.signalAll();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    while (true){
                        Thread.sleep(500);
//                        使用if会导致等待在条件变量上的线程被唤醒有可能不是因为条件满足而是由于虚假唤醒。
//                       线程只是被唤醒了，并没有满足执行下面代码的条件，所以得用while再次判断是否满足
                        while (queue.size() == 0) {
                            notFull.await();
                        }
                        String ele = queue.poll();
                        System.out.println(ele);
                        notEmpty.signalAll();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });

        producer.start();
        consumer.start();


    }
}
