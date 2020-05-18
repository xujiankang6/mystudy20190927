package com.jiankang.javaprogramminglogic.chapter19.v2;

/*
 *@create by jiankang
 *@date 2020/5/16 time 14:35
 */
//实现同时开始场景
import java.util.concurrent.CountDownLatch;

public class RacerWithCountDownLatch {

    static class Racer extends Thread {
        CountDownLatch latch;

        public Racer(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                this.latch.await();
                System.out.println(getName() + " start run " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        int num = 100;
        CountDownLatch latch = new CountDownLatch(10);
        Thread[] races = new Thread[num];
        for (int i = 0; i < num; i++) {
            races[i] = new Racer(latch);
            races[i].start();
        }
      while (true){
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          System.out.println("倒计时：  "+latch.getCount());
          latch.countDown();
          if(latch.getCount()==0){
              return;
          }
      }
    }
}
