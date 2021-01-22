package com.jiankang.depthunderstandjavavirtualmachine.chapter4.v5;

/*
 *@create by jiankang
 *@date 2020/12/3 @time 9:36
 *死锁代码样例
 */



public class DeadThreadTest {


    static  class SynAddRunnable implements Runnable{
        int a,b;

        public SynAddRunnable(int a, int b) {
            this.a = a;
            this.b = b;
        }


        @Override
        public void run() {
            synchronized (Integer.valueOf(a)){
                synchronized (Integer.valueOf(b)){
                    System.out.println(a+b);
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new SynAddRunnable(1,2)).start();
            new Thread(new SynAddRunnable(2,1)).start();
        }
    }
}
