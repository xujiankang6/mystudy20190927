package com.jiankang.javaprogramminglogic.chapter26.v3;

/*
 *@create by jiankang
 *@date 2020/5/26 time 20:23
 */

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestThenRun {


    public static void main(String[] args) {
        Runnable taskA = () -> System.out.println("task A");
        Runnable taskB = () -> System.out.println("task B");
        Runnable taskC = () -> System.out.println("task C");
        Void join = CompletableFuture.runAsync(taskA).thenRun(taskB).thenRun(taskC).join();
        System.out.println(join);

        Supplier<String> taskA1 = () -> "hello";
        Function<String, String> taskBB = (t) -> t.toUpperCase();
        Consumer<String> taskCC = (t) -> System.out.println("consume: " + t);
        CompletableFuture.supplyAsync(taskA1).thenApply(taskBB).thenAccept(taskCC).join();
        String join2 = CompletableFuture.supplyAsync(taskA1).thenApply(taskBB).join();
        System.out.println(join2);

    }
}
