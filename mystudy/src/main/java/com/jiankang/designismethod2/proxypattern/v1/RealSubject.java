package com.jiankang.designismethod2.proxypattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/13 time 12:02
 */

public class RealSubject implements  Subject {
    @Override
    public void Request() {
        System.out.println("真正的请求！！！");
    }
}
