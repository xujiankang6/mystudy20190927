package com.jiankang.improvejava151suggests.chapter9.v12;

/*
 *@create by jiankang
 *@date 2020/11/5 time 16:13
 */

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(5);
        for (int i = 0; i < 10; i++) {
//            bq.add("");
            bq.put("a");
        }
    }
}
