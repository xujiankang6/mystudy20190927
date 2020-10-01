package com.jiankang.javaasynprogrampractice.chapter3.v1;

/*
 *@create by jiankang
 *@date 2020/9/24 time 13:37
 */

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        final CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {

            @Override
            public String get() {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return "hello jiankang";
            }
        });

        future.whenComplete(new BiConsumer<String, Throwable>() {

            @Override
            public void accept(String s, Throwable throwable) {
                if(null==throwable){
                    System.out.println(s);
                }else {
                    System.out.println(throwable.getLocalizedMessage());
                }
            }
        });
       Thread.currentThread().join();


    }
}
