package com.jiankang.improvejava151suggests.chapter7.v5;

/*
 *@create by jiankang
 *@date 2020/10/30 time 17:53
 */

public interface Animal {
    public void doStuff();
}

class Rat implements Animal{

    @Override
    public void doStuff() {
        System.out.println("Jerry will play with Tom.");
    }
}