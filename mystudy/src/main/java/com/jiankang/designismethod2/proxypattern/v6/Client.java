package com.jiankang.designismethod2.proxypattern.v6;

/*
 *@create by jiankang
 *@date 2019/11/13 time 18:28
 */

import net.sf.cglib.proxy.InvocationHandler;

public class Client {
    public static void main(String[] args) {
        //定义一个主题  未实现SubjectDynamicProxy代理类
        Subject subject = new RealSubject();
        //定义一个handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        //定义主题的代理
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
        //代理的行为
        proxy.doSomething("Finish");

        //实现SubjectDynamicProxy代理类
        Subject subjectProxy = SubjectDynamicProxy.newProxyInstance(subject);
        subjectProxy.doSomething("subject");
    }
}
