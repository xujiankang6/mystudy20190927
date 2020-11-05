package com.jiankang.improvejava151suggests.chapter9.v3;

/*
 *@create by jiankang
 *@date 2020/11/4 time 20:05
 */

public class Test {
    public static void main(String[] args) throws InterruptedException {
        int value = 1000;
        int loops = 0;

         ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
         while (loops++<value){
              UnsafeThread ut = new UnsafeThread();
             for (int i = 0; i < value; i++) {
                 new Thread(ut).start();
             }
             do{
                 Thread.sleep(15);
             }while (threadGroup.activeCount()!=1);
             if(ut.getCount()!=value){
                 System.out.println("循环到第： "+loops + "次出现了线程不安全情况");
                 System.out.println("此时count = "+ut.getCount());
                 System.exit(0);
             }
         }
    }
}
