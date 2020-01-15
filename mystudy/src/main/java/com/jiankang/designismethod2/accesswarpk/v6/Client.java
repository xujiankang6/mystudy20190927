package com.jiankang.designismethod2.accesswarpk.v6;

/*
 *@create by jiankang
 *@date 2020/1/12 time 21:25
 */

public class Client {
    public static void main(String[] args) {
        IStar star = new Singer();
        IStar agent = new Agent(star);
        agent.sign();
    }
}
