package com.jiankang.javaconcurrencybeauty.chapter3.v1;

/*
 *@create by jiankang
 *@date 2020/10/22 time 18:40
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyListTest {
    private static volatile CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        arrayList.add("hello");
        arrayList.add("alibaba");
        arrayList.add("welcome");
        arrayList.add("to");
        arrayList.add("hangzhou");

         Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                arrayList.set(1, "baba");
                arrayList.remove(2);
                arrayList.remove(3);
            }
        });
         Iterator<String> itr = arrayList.iterator();
         thread.start();
         thread.join();
         while (itr.hasNext()){
             System.out.println(itr.next());
         }

        System.out.println(Arrays.asList(arrayList));



    }
}
