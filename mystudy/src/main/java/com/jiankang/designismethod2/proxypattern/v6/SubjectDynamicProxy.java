package com.jiankang.designismethod2.proxypattern.v6;

/*
 *@create by jiankang
 *@date 2019/11/13 time 18:56
 */

import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;

public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject) {
        return newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),new MyInvocationHandler(subject));
    }

}
