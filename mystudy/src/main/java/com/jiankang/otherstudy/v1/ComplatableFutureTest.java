package com.jiankang.otherstudy.v1;

import java.util.concurrent.CompletableFuture;

public class ComplatableFutureTest {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(()->1).thenApply(i->i+1)
                .thenApply(i->i*i).whenComplete((r,e)-> System.out.println(r));
    }
}
