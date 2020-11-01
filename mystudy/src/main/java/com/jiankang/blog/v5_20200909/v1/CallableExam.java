package com.jiankang.blog.v5_20200909.v1;

/*
 *@create by jiankang
 *@date 2020/9/9 time 17:09
 */

import java.util.concurrent.*;

public class CallableExam {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ExecutorService service = Executors.newCachedThreadPool();
        final Future<Integer> future = service.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Callable is running");
                TimeUnit.SECONDS.sleep(2);
                return 47;
            }
        });
        service.shutdown();
        System.out.println("future.get = " + future.get());
    }
}
