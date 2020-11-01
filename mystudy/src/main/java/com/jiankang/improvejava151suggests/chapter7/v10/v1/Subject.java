package com.jiankang.improvejava151suggests.chapter7.v10.v1;

/*
 *@create by jiankang
 *@date 2020/11/1 time 14:26
 */

public interface Subject {

    public void request();
}

class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("real subject execute");
    }
}

//代理类
class Proxy implements Subject{
    private Subject subject = null;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public Proxy() {
        subject = new RealSubject();
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();

    }

    private void after() {
        System.out.println("after execute");
    }

    private void before() {
        System.out.println("before execute");
    }
}
