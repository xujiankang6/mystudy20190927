package com.jiankang.javaprogramminglogic.chapter14.v1;

/*
 *@create by jiankang
 *@date 2020/3/30 time 15:45
 */

import java.io.IOException;
import java.util.Random;

public class Consumer {
    public static void main(String[] args) {
        try {
            BasicQueue queue = new BasicQueue("./", "task");
            Random rnd = new Random();
            while (true) {
                byte[] bytes = queue.dequeue();
                if (bytes == null) {
                    Thread.sleep(rnd.nextInt(1000));
                    continue;
                }
                System.out.println("consume: " + new String(bytes, "UTF-8"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
