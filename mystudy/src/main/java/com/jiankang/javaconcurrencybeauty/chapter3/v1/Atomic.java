package com.jiankang.javaconcurrencybeauty.chapter3.v1;

/*
 *@create by jiankang
 *@date 2020/10/21 time 19:25
 */

import java.util.concurrent.atomic.AtomicLong;

public class Atomic {

    private static AtomicLong atomicLong = new AtomicLong();

    private static Integer[] arrayOne = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 1, 0};
    private static Integer[] arrayTwo = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 1, 0};

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                int size = arrayOne.length;
                for (int i = 0; i < size; i++) {
                    if (arrayOne[i].intValue() == 0) {
                        atomicLong.incrementAndGet();
                    }

                }
            }
        });
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                int size = arrayTwo.length;
                for (int i = 0; i < size; i++) {
                    if (arrayOne[i].intValue() == 0) {
                        atomicLong.incrementAndGet();
                    }

                }
            }
        });
        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
        System.out.println("count 0: " + atomicLong.get());
    }
}
