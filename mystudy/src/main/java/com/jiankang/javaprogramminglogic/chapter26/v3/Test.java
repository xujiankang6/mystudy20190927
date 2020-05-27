package com.jiankang.javaprogramminglogic.chapter26.v3;

/*
 *@create by jiankang
 *@date 2020/5/26 time 16:28
 */

import java.util.Random;
import java.util.concurrent.*;
import java.util.function.Supplier;

public class Test {
    private static Random rnd = new Random();

    private static ExecutorService executor = Executors.newFixedThreadPool(10);

    static int delayRandom(int min, int max) {
        int milli = max > min ? rnd.nextInt(max - min) : 0;
        try {
            Thread.sleep(min + milli);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return milli;
    }

    static Callable<Integer> externalTask = () -> {
        int time = delayRandom(20, 2000);
        return time;
    };

    static Supplier<Integer> externalTask2 = () -> {
        int time = delayRandom(20, 2000);
        return time;
    };

    private static Future<Integer> callExternalService() {
        return executor.submit(externalTask);
    }

    public static Future<Integer> callExternalService3(){
        FutureTask<Integer> future = new FutureTask<>(externalTask);
        new Thread(){
            @Override
            public void run() {
                future.run();
            }
        };
        return future;
    }

    public static Future<Integer> callExternalService4(){
        CompletableFuture<Integer> future = new CompletableFuture<>();
        new Thread(){
            @Override
            public void run() {
                try {
                    future.complete(externalTask2.get());
                } catch (Exception e) {
                    future.completeExceptionally(e);
                }
            }
        }.start();
        return future;
    }


    private static Future<Integer> callExternalService2() {
        return CompletableFuture.supplyAsync(externalTask2,executor);
    }







    public static void master() {
        //执行异步任务
        Future<Integer> asyncRet = callExternalService();
        //执行异步任务的结果，处理可能的异常
        try {
            Integer integer = asyncRet.get();
            System.out.println(integer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Integer join = CompletableFuture.supplyAsync(externalTask2).whenComplete((result, ex) -> {
            if (result != null) {
                System.out.println(result);
            }
            if (ex != null) {
                ex.printStackTrace();
            }
        }).join();
        System.out.println(join);
    }


}
