package com.jiankang.javaprogramminglogic.chapter15.v5;

/*
 *@create by jiankang
 *@date 2020/5/2 time 15:13
 */

class WaitThread extends Thread {
    private volatile boolean fire =false;

    @Override
    public void run() {
        synchronized (this){
            while (!fire){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("fired");

            }

        }
    }

    public synchronized void fire(){
        this.fire = true;
        notify();
    }

    public static void main(String[] args) throws InterruptedException {
        WaitThread waitThread = new WaitThread();
        waitThread.start();
        Thread.sleep(1000);
        System.out.println("fire");
        waitThread.fire();
    }
}
