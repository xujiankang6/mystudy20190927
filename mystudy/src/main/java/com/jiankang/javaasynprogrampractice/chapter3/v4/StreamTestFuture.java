package com.jiankang.javaasynprogrampractice.chapter3.v4;

/*
 *@create by jiankang
 *@date 2020/9/24 time 16:30
 * stream与CompletableFuture结合study
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class StreamTestFuture {

    public static String rpcCall(String ip,String param){
        System.out.println(ip+" rpcCall: "+param);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return param;
    }

    public static void main(String[] args) {
        List<String> ipList = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            ipList.add("192.168.0."+i);
        }
        final long start = System.currentTimeMillis();
         ArrayList<String> result = new ArrayList<>();
        for (String ip : ipList) {
            result.add(rpcCall(ip,ip));
        }
        result.stream().forEach(r-> System.out.println(r));
        System.out.println("cost: "+(System.currentTimeMillis()-start));

        //user CompletableFuture
        final long start2 = System.currentTimeMillis();
        final List<CompletableFuture<String>> futureList = ipList.stream().map(ip -> CompletableFuture.supplyAsync(() -> rpcCall(ip, ip))).collect(Collectors.toList());

        final List<String> resultList = futureList.stream().map(future -> future.join()).collect(Collectors.toList());
        resultList.stream().forEach(r-> System.out.println(r));


        System.out.println("cost2: "+(System.currentTimeMillis()-start2));
    }
}
