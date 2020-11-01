package com.jiankang.javaasynprogrampractice.chapter3.v3;

/*
 *@create by jiankang
 *@date 2020/9/24 time 14:51
 */

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableExceptionTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final CompletableFuture<String> future = new CompletableFuture<>();
        new Thread(()->{
            try {
                if(true){
                    throw new RuntimeException("Excetion test");
                }
                future.complete("ok");
            }catch (Exception e){
                future.completeExceptionally(e);
                System.out.println("-----"+Thread.currentThread().getName()+" set future result ----------");
            }
        },"thread-1").start();
//        System.out.println(future.get());
        System.out.println(future.exceptionally(t->"default").get());
    }
}
