package com.jiankang.javaconcurrencybeauty.chapter1.v2;

/*
 *@create by jiankang
 *@date 2020/10/6 time 16:07
 */

public class NotifyTest {
    private static volatile Object resourseA = new Object();

    public static void main(String[] args) throws InterruptedException {
         Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourseA) {
                    System.out.println("threadA get resourceA lock");
                    try {
                        System.out.println("threadA begin wait");
                        resourseA.wait();
                        System.out.println("threadA end wait");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });


         Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourseA) {
                    System.out.println("threadB get resourceA lock");
                    try {
                        System.out.println("threadB begin wait");
                        resourseA.wait();
                        System.out.println("threadB end wait");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });


        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourseA) {
                    System.out.println("threadC get resourceA lock");
                    try {
                        System.out.println("threadC begin notify");
                        resourseA.notifyAll();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        threadA.start();
        threadB.start();
        Thread.sleep(1000);
        threadC.start();
        threadA.join();
        threadB.join();
        threadC.join();
        System.out.println("main over");

    }

}
