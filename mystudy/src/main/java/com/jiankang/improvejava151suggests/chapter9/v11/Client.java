package com.jiankang.improvejava151suggests.chapter9.v11;

/*
 *@create by jiankang
 *@date 2020/11/5 time 14:19
 */

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) {
        final A a = new A();
        final B b = new B();
        new Thread(new Runnable() {
            @Override
            public void run() {
                a.a1(b);
            }
        }, "线程A").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                b.b1(a);
            }
        }, "线程B").start();

    }


    static class A {

        Lock lock = new ReentrantLock();

        public synchronized void a1(B b) {
            String name = Thread.currentThread().getName();
            try {
                System.out.println(name + "进入A.a1()");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "试图访问B.b2()");
            b.b2();

        }

        public void a2() {
            try {
                if (lock.tryLock(2, TimeUnit.SECONDS)) {
                    System.out.println("进入a.a2()");
                }
            } catch (Exception e) {

            } finally {
                lock.unlock();
            }
        }
    }

    static class B {
        Lock lock = new ReentrantLock();

        public synchronized void b1(A a) {
            String name = Thread.currentThread().getName();
            System.out.println(name + "进入B.b1()");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "试图访问A.a2()");
            a.a2();
        }

        public void b2() {
            try {
                if (lock.tryLock(2, TimeUnit.SECONDS)) {
                    System.out.println("进入B.b2()");
                }
            } catch (Exception e) {

            } finally {
                lock.unlock();
            }
        }
    }
}


