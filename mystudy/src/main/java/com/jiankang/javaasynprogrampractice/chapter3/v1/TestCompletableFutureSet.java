package com.jiankang.javaasynprogrampractice.chapter3.v1;

/*
 *@create by jiankang
 *@date 2020/9/23 time 20:01
 */

import java.util.concurrent.*;

public class TestCompletableFutureSet {

    private final static int AVALIABLE_PROCESSORS = Runtime.getRuntime().availableProcessors();
    private final static ThreadPoolExecutor POOL_EXECUTOR = new ThreadPoolExecutor(AVALIABLE_PROCESSORS,AVALIABLE_PROCESSORS*2,
            1, TimeUnit.MINUTES,new LinkedBlockingQueue<>(5),new ThreadPoolExecutor.CallerRunsPolicy());

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        final CompletableFuture<String> future = new CompletableFuture<>();
        POOL_EXECUTOR.execute(()->{
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("-------"+Thread.currentThread().getName()+" set future result-------");
            future.complete("hello,jiankang");
        });

        System.out.println("------main thread wait future result -------");
        System.out.println(future.get());


        System.out.println("end");
    }
}
