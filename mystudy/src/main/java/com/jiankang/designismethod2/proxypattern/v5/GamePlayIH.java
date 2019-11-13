package com.jiankang.designismethod2.proxypattern.v5;

/*
 *@create by jiankang
 *@date 2019/11/13 time 17:19
 */


import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {
    //被代理者
    Class cls = null;
    //被代理的实例
    Object obj = null;
    //我要代理谁
    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    //调用被代理的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj,args);
        return result;
    }
}
