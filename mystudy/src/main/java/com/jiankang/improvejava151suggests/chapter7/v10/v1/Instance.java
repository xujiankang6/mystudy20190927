package com.jiankang.improvejava151suggests.chapter7.v10.v1;

/*
 *@create by jiankang
 *@date 2020/11/1 time 14:25
 */

public class Instance {
    public static void main(String[] args) {
        //一个简单的静态代理
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
