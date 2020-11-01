package com.jiankang.javacoretechnologythetenversion.chapter6.v1;

/*
 *@create by jiankang
 *@date 2020/6/5 time 14:24
 */

public class QQSend implements Send {
    @Override
    public void receive() {
        System.out.println("我收到了");
    }
}
