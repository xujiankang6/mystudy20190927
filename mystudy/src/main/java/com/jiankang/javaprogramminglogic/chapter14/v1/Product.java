package com.jiankang.javaprogramminglogic.chapter14.v1;

/*
 *@create by jiankang
 *@date 2020/3/30 time 15:48
 */

import java.io.IOException;
import java.util.Random;

public class Product {
    public static void main(String[] args) {
        try {
            BasicQueue queue = new BasicQueue("./", "task");
            int i = 0;
            Random rnd = new Random();
            while (true) {
                String msg = new String("task" + (i++));
                queue.enqueue(msg.getBytes("UTF-8"));
                System.out.println("produce : "+msg);
                Thread.sleep(rnd.nextInt(1000));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
