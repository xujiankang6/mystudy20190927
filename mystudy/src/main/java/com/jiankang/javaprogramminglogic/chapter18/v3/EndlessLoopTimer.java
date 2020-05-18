package com.jiankang.javaprogramminglogic.chapter18.v3;

/*
 *@create by jiankang
 *@date 2020/5/12 time 20:18
 */

import java.util.Timer;
import java.util.TimerTask;

public class EndlessLoopTimer {

    static class LoopTask extends TimerTask {

        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class ExampleTask extends  TimerTask{

        @Override
        public void run() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new LoopTask(),10);
        timer.schedule(new ExampleTask(),100);
    }
}
