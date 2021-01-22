package com.jiankang.improvejava151suggests.chapter9.v13;

/*
 *@create by jiankang
 *@date 2020/11/5 time 16:55
 */

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Runner implements Callable<Integer> {
    private CountDownLatch begin;
    private CountDownLatch end;

    public Runner(CountDownLatch begin, CountDownLatch end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        int score = new Random().nextInt(25);
        begin.await();
        TimeUnit.MILLISECONDS.sleep(score);
        end.countDown();
        return score;
    }
}
