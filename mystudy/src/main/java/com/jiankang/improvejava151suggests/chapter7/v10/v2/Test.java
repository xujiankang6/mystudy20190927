package com.jiankang.improvejava151suggests.chapter7.v10.v2;

/*
 *@create by jiankang
 *@date 2020/11/1 time 14:25
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //具体的角色，也就是被代理类
        Subject subject = new RealSubject();
        //代理实例的处理Handler
        InvocationHandler subjectHandler = new SubjectHandler(subject);

        Subject proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), subjectHandler);

        proxy.request();
    }
}
