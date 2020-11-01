package com.jiankang.mukewang.v2;

/*
 *@create by jiankang
 *@date 2020/10/1 time 22:35
 */

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        final TwoPhaseTermination twoPhaseTermination = new TwoPhaseTermination();
        twoPhaseTermination.start();
        Thread.sleep(3000);
        twoPhaseTermination.stop();
    }
}

class TwoPhaseTermination{
    private Thread monitor;

    public void start(){
        monitor=new Thread(()->{
            while (true){
                 Thread current = Thread.currentThread();
                if(current.isInterrupted()){
                    System.out.println("料理后事");
                    break;
                }

                try {
                    Thread.sleep(1000);
                    System.out.println("执行监控记录");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    current.interrupt();
                }
            }
        });
        monitor.start();
    }


    public void stop(){
        monitor.interrupt();
    }





}
