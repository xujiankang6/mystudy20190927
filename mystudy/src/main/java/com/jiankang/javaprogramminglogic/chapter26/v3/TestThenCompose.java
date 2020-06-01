package com.jiankang.javaprogramminglogic.chapter26.v3;

/*
 *@create by jiankang
 *@date 2020/5/27 time 13:52
 */

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestThenCompose {

    public static void main(String[] args) {
        testC();
    }

    //对thenCompose进行测试
    public static void testA() {
        Supplier<String> taskA = () -> "hello";
        Function<String, CompletableFuture<String>> taskB = (t) -> CompletableFuture.supplyAsync(() -> t.toUpperCase());
        Consumer<String> taskC = (t) -> System.out.println("consume: " + t);
        Void join = CompletableFuture.supplyAsync(taskA).thenCompose(taskB).thenAccept(taskC).join();
        System.out.println(join);
    }

    //对thenCombineAsync进行测试
    public static void testB() {
        Supplier<String> taskA = () -> "hello";
        CompletableFuture<String> taskB = CompletableFuture.supplyAsync(() -> "taskB");
        BiFunction<String, String, String> taskC = (a, b) -> a + ",  " + b;
        String join = CompletableFuture.supplyAsync(taskA).thenCombineAsync(taskB, taskC).join();
        System.out.println(join);
    }

    //前面两个阶段只需要一个成功就可以执行下一步了
    public static void testC() {
        Supplier<String> taskA = () -> "hello";
        CompletableFuture<String> taskB = CompletableFuture.supplyAsync(() -> "taskB");
        Function<String, CompletableFuture<String>> taskC = (t) -> CompletableFuture.supplyAsync(() -> t.toUpperCase());
        CompletableFuture<String> join = CompletableFuture.supplyAsync(taskA).applyToEither(taskB, taskC).join();
        System.out.println(join.join());
    }


}
