package com.jiankang.improvejava151suggests.chapter9.v13;

/*
 *@create by jiankang
 *@date 2020/11/5 time 16:57
 */

import java.util.ArrayList;
import java.util.concurrent.*;

public class Clinet {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int num = 10;
        CountDownLatch begin = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(num);
        ExecutorService es = Executors.newFixedThreadPool(num);
        ArrayList<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            futures.add(es.submit(new Runner(begin, end)));
        }
        begin.countDown();
        end.await();
        int count = 0;
        for (Future<Integer> future : futures) {
            count += future.get();
        }
        System.out.println("平均分数为： " + count / num);
    }
}
