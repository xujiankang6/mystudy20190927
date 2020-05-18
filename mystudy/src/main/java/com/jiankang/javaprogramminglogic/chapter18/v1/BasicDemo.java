package com.jiankang.javaprogramminglogic.chapter18.v1;

/*
 *@create by jiankang
 *@date 2020/5/11 time 20:36
 */

import java.util.Random;
import java.util.concurrent.*;

public class BasicDemo {

    static class Task implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            int sleepSeconds = new Random().nextInt(1000);
            Thread.sleep(sleepSeconds);
            return sleepSeconds;
        }
    }


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new Task());
        Thread.sleep(1100);
        System.out.println(future.get());
        executor.shutdown();

    }
}
