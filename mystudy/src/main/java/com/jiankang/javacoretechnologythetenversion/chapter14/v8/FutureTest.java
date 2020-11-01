package com.jiankang.javacoretechnologythetenversion.chapter14.v8;

/*
 *@create by jiankang
 *@date 2020/7/3 time 16:22
 */

import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTest {
    public static void main(String[] args) {
        MatchCounter counter = new MatchCounter(new File("D:\\mystudy20190927\\mystudy\\src\\main\\java\\com\\jiankang\\javacoretechnologythetenversion\\chapter14\\v8"), "public class");
        FutureTask<Integer> task = new FutureTask<>(counter);
        Thread t = new Thread(task);
        t.start();
        try {
            System.out.println(task.get() + " matching files. ");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

}
