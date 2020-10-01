package com.jiankang.blog.v6_20200918.v1;

/*
 *@create by jiankang
 *@date 2020/9/18 time 18:54
 */

import java.util.concurrent.*;
import java.util.function.Supplier;

public class JavaFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ExecutorService executorService = Executors.newFixedThreadPool(1);
//        final Future<String> submit = executorService.submit(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                Thread.sleep(3000);
//                return "hello";
//            }
//        });
//        System.out.println(submit.get());
//        System.out.println("main thread is blocked");


         CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                return "asaaa";
            }
        }, executorService);
        System.out.println("aaaaaaaaa");

        executorService.shutdown();
        System.out.println(future.get());





    }
}
