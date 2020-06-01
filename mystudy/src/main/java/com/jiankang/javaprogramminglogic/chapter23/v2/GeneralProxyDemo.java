package com.jiankang.javaprogramminglogic.chapter23.v2;

/*
 *@create by jiankang
 *@date 2020/5/21 time 15:45
 */


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GeneralProxyDemo {
    static interface IServiceA {
        public void sayHello();
    }

    static class ServiceAImpl implements IServiceA {

        @Override
        public void sayHello() {
            System.out.println("hello");
        }
    }


    static interface IServiceB {
        public void fly();
    }

    static class ServiceBImpl implements IServiceB {

        @Override
        public void fly() {
            System.out.println("flying");
        }
    }


    static class SimpleInvocationHandler implements InvocationHandler {
        private Object realObj;

        public SimpleInvocationHandler(Object realObj) {
            this.realObj = realObj;
        }


        private static <T> T getProxy(Class<T> intf, T realObj) {
            return (T) Proxy.newProxyInstance(intf.getClassLoader(), new Class<?>[]{intf}, new SimpleInvocationHandler(realObj));
        }


        @Override
        public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
            System.out.println("entering " + realObj.getClass().getSimpleName() + "::" + method.getName());
            Object invoke = method.invoke(realObj, objects);
            System.out.println("leaving " + realObj.getClass().getSimpleName() + "::" + method.getName());
            return invoke;
        }


        public static void main(String[] args) {
            IServiceA a = new ServiceAImpl();
            IServiceA proxy = getProxy(IServiceA.class, a);
            proxy.sayHello();
            IServiceB b = new ServiceBImpl();
            IServiceB proxy1 = getProxy(IServiceB.class, b);
            proxy1.fly();
        }
    }

}
