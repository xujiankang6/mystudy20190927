package com.jiankang.improvejava151suggests.chapter9.v1;

/*
 *@create by jiankang
 *@date 2020/11/3 time 19:37
 */

public class SpamMachine extends Thread {

    @Override
    public void run() {
        System.out.println("create cabage more!");
    }

    public static void main(String[] args) {
        while (true){
             SpamMachine sm = new SpamMachine();
             if(!false){
                 sm.stop();
             }
             sm.start();
        }

    }
}
