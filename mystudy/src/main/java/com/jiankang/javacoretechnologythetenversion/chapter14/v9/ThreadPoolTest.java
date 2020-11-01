package com.jiankang.javacoretechnologythetenversion.chapter14.v9;

/*
 *@create by jiankang
 *@date 2020/7/3 time 19:26
 */

import java.io.File;
import java.util.concurrent.*;

public class ThreadPoolTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        MatchCounter counter = new MatchCounter(new File("D:\\mystudy20190927"), "public static class", pool);
        Future<Integer> result = pool.submit(counter);
        try {
            System.out.println(result.get() + "  matching files");
        } catch (Exception e) {
            e.printStackTrace();
        }
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(pool);
        Future submit = executorCompletionService.submit(counter);
        System.out.println(submit.get());
        System.out.println(executorCompletionService.take().get());
        pool.shutdown();
        int largestPoolSize = ((ThreadPoolExecutor) pool).getLargestPoolSize();
        System.out.println("largest pool size= " + largestPoolSize);


    }
}
