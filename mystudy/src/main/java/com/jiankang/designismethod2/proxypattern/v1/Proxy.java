package com.jiankang.designismethod2.proxypattern.v1;

/*
 *@create by jiankang
 *@date 2019/11/13 time 12:03
 */

import com.jiankang.designismethod2.factorymethod.v2.Product;

public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy() {
        this.subject = new Proxy();
    }

    /*
    在代理类的构造函数中传递被代理者
     */
    public Proxy(Object... objects) {

    }


    @Override
    public void Request() {
        this.before();
        this.subject.Request();
        this.after();
    }

    //预处理
    private void before() {
        // do something
    }

    private void after() {
        // do something
    }
}


