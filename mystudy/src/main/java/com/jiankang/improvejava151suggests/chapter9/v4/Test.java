package com.jiankang.improvejava151suggests.chapter9.v4;

/*
 *@create by jiankang
 *@date 2020/11/4 time 20:22
 */

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newSingleThreadExecutor();
         Future<Integer> future = es.submit(new TaxCalculator(100));
         while (!future.isDone()){
             TimeUnit.MILLISECONDS.sleep(200);
             System.out.print("#");
         }
        System.out.println("计算完成，税金是： "+future.get() + "元");
         es.shutdown();
    }
}
