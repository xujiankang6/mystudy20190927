package com.jiankang.javacoretechnologythetenversion.chapter6.v7;

/*
 *@create by jiankang
 *@date 2020/6/11 time 21:31
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TraceHandler implements InvocationHandler {
    private Object target;

    public TraceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print(target);
        System.out.print("." + method.getName() + "(");
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) System.out.print(",");
            }
        }
        System.out.println(")");
        return method.invoke(target, args);
    }

    public static void main(String[] args) {
        InvocationHandler handler = new TraceHandler("aaa");
        Object proxy = Proxy.newProxyInstance(null, new Class[]{Comparable.class}, handler);

        System.out.println(proxy);
    }
}
