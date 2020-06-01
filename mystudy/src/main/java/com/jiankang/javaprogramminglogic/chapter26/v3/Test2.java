package com.jiankang.javaprogramminglogic.chapter26.v3;

/*
 *@create by jiankang
 *@date 2020/5/26 time 20:16
 */

import java.util.concurrent.CompletableFuture;

public class Test2 {
    public static void main(String[] args) {
        String ret = CompletableFuture.supplyAsync(() -> {
            throw new RuntimeException("test");
        }).handle((result, ex) -> {
            return "hello";
        }).join();
        System.out.println(ret);
    }
}
