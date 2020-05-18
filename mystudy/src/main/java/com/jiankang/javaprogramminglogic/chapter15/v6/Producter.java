package com.jiankang.javaprogramminglogic.chapter15.v6;

/*
 *@create by jiankang
 *@date 2020/5/2 time 16:07
 */

public class Producter extends Thread {
    MyBlockingQueue<String> queue;

    public Producter(MyBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int num = 0;
        try {
            while (true){
                String task = String.valueOf(num);
                queue.put(task);
                System.out.println("produce task: "+task);
                num++;
                Thread.sleep((long) (Math.random()*100));
            }

        }catch (Exception e){}
    }
}
