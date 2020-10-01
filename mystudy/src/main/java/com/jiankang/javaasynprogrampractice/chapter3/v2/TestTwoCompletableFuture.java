package com.jiankang.javaasynprogrampractice.chapter3.v2;

/*
 *@create by jiankang
 *@date 2020/9/24 time 13:53
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class TestTwoCompletableFuture {

    public static CompletableFuture<String> doSomethingOne(String encodeCompanyId) {
        return CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return encodeCompanyId;
            }
        });
    }

    public static CompletableFuture<String> doSomethingTwo(String CompanyId) {
        return CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return CompanyId + ":alibaba";
            }
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final CompletableFuture<String> result = doSomethingOne("123").thenCompose(id -> doSomethingTwo(id));
        System.out.println(result.get());
        final CompletableFuture completableFuture = doSomethingOne("123").thenCombine(doSomethingTwo("456"), new A());
        final CompletableFuture completableFuture1 = doSomethingOne("123").thenCombine(doSomethingTwo("456"), new BiFunction() {
            @Override
            public Object apply(Object o, Object o2) {
                return o + "" + o2;
            }
        });
        final CompletableFuture completableFuture2 = doSomethingOne("123").thenCombine(doSomethingTwo("456"), (a, b) -> {
            return a + "" + b;
        });

        System.out.println(completableFuture.get());
        System.out.println(completableFuture1.get());
        System.out.println(completableFuture2.get());


        List<CompletableFuture<String>> futureList = new ArrayList<>();
        futureList.add(doSomethingOne("1"));
        futureList.add(doSomethingOne("2"));
        futureList.add(doSomethingOne("3"));
        futureList.add(doSomethingOne("4"));
        final CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(futureList.toArray(new CompletableFuture[futureList.size()]));
        System.out.println(voidCompletableFuture.get());

        final CompletableFuture<Object> voidCompletableFuture1 = CompletableFuture.anyOf(futureList.toArray(new CompletableFuture[futureList.size()]));
        System.out.println(voidCompletableFuture1.get());

    }


}

class A implements BiFunction {

    @Override
    public Object apply(Object o, Object o2) {
        return o + "" + o2;
    }
}
