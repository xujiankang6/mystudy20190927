package com.jiankang.designismethod2.proxypattern.v6;

/*
 *@create by jiankang
 *@date 2019/11/13 time 18:11
 */

import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    //被代理的对象
    private Object target = null;

    //通过构造函数传递过来
    public MyInvocationHandler(Object object) {
        this.target = object;
    }

    //代理方法
    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        //执行被代理的方法
        return method.invoke(this.target, args);
    }
}
