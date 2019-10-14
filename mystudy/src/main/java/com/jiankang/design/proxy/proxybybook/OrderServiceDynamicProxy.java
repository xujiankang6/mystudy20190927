package com.jiankang.design.proxy.proxybybook;

import com.jiankang.design.proxy.Order;
import com.jiankang.design.proxy.staticproxy.OrderServiceStaticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {


    private Object target;


    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object objarg=args[0];
        beforeMethod(objarg);
        Object object=method.invoke(target,args);
        return object;
    }

    public void beforeMethod(Object obj) {
        int orderId = 1;
        System.out.println("动态代理 beforeMethod code");
        if (obj instanceof Order) {
            Order order = (Order) obj;
            orderId = order.getUserId();
        }
        int dbRouter = orderId % 2;
        System.out.println("动态代理分配到【" + dbRouter + "】处理数据");
    }

    private void afterMethod() {
        System.out.println("静态代理after code");
    }
}
