package com.jiankang.javaconcurrencybeauty.chapter7.v1;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {


        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(3);
        arrayBlockingQueue.offer(1);
        arrayBlockingQueue.offer(2);
        arrayBlockingQueue.offer(3);
        arrayBlockingQueue.poll();
        arrayBlockingQueue.poll();
        arrayBlockingQueue.poll();
        arrayBlockingQueue.poll();

    }
}
