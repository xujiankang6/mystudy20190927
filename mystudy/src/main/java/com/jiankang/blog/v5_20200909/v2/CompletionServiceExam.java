package com.jiankang.blog.v5_20200909.v2;

/*
 *@create by jiankang
 *@date 2020/9/9 time 17:18
 */

import java.util.concurrent.*;

public class CompletionServiceExam {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        final ExecutorService service = Executors.newCachedThreadPool();
        final ExecutorCompletionService<Integer> completionService = new ExecutorCompletionService<>(service);

        for (int i = 0; i < 5; i++) {
            completionService.submit(new TaskInterger(i));
        }
        service.shutdown();
        for (int i = 0; i < 5; i++) {
            final Future<Integer> future = completionService.take();
            System.out.println(future.get());
        }
        TimeUnit.SECONDS.sleep(11111);
        System.out.println("success");
    }
}
