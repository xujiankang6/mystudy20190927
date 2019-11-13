package com.jiankang.designismethod2.proxypattern.v6;

/*
 *@create by jiankang
 *@date 2019/11/13 time 18:16
 * 动态代理类
 */

import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;

public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        //寻找JoinPoint 连接点，AOP框架使用元数据定义
        if (true) {
            //执行一个前置通知
            (new BeforeAdvice()).exec();
        }
        Object o = Proxy.newProxyInstance(loader, interfaces, handler);
        return (T) o;
    }
}
