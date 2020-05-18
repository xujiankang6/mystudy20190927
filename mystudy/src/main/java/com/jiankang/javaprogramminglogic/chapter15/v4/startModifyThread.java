package com.jiankang.javaprogramminglogic.chapter15.v4;

/*
 *@create by jiankang
 *@date 2020/5/2 time 14:17
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class startModifyThread {

    private static void startModifyThread(final List<String> list) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    list.add("item " + i);
                    try {
                        Thread.sleep((long) (Math.random() * 10));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }
        };
        thread.start();
    }


    private static void startIteratorThread(final List<String> list) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (list){
                        for (String str : list) {

                            System.out.println(str);
                        }
                    }
                }
            }
        };
        thread.start();
    }

    public static void main(String[] args){
        final List<String> list = Collections.synchronizedList(new ArrayList<String>());
        startIteratorThread(list);
        startModifyThread(list);
    }
}
