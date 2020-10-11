package com.jiankang.javaconcurrencybeauty.chapter1.v1;

/*
 *@create by jiankang
 *@date 2020/10/6 time 15:20
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallerTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "hello";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final FutureTask<String> task = new FutureTask<>(new CallerTask());
        new Thread(task).start();
        final String s = task.get();
        System.out.println(s);
    }
}
