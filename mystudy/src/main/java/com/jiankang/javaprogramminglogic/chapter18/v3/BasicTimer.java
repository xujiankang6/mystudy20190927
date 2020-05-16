package com.jiankang.javaprogramminglogic.chapter18.v3;

/*
 *@create by jiankang
 *@date 2020/5/12 time 15:08
 */

import java.util.Timer;
import java.util.TimerTask;

public class BasicTimer {
    static class LongRunningTask extends TimerTask {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("long running finished  task");
        }
    }

    static class FixedDelayTask extends TimerTask {

        @Override
        public void run() {
            System.out.println(System.currentTimeMillis());
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        timer.schedule(new LongRunningTask(), 10);
//        timer.schedule(new FixedDelayTask(), 100, 1000);
        timer.scheduleAtFixedRate(new FixedDelayTask(), 100, 1000);
    }
}
