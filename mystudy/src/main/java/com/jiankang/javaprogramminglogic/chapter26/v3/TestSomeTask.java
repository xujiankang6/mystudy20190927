package com.jiankang.javaprogramminglogic.chapter26.v3;

/*
 *@create by jiankang
 *@date 2020/5/27 time 14:40
 */

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSomeTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);
        CompletableFuture<String> taskA = CompletableFuture.supplyAsync(() -> {
            Test.delayRandom(100, 1000);
            return "helloA";
        }, executor);


        CompletableFuture<String> taskB = CompletableFuture.supplyAsync(() -> {
            Test.delayRandom(2000, 3000);
            return "helloB";
        }, executor);

        CompletableFuture<Void> taskC = CompletableFuture.runAsync(() -> {
            Test.delayRandom(30, 100);
            throw new RuntimeException("task C exception");
        });

        CompletableFuture.allOf(taskA, taskB, taskC).whenComplete((result, ex) -> {
            if (ex != null) {
                System.out.println(ex.getMessage());
            }
            if (!taskA.isCompletedExceptionally()) {
                System.out.println("taskA " + taskA.join());
            }
        });
    }
}
