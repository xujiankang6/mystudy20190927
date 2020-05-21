package com.jiankang.javaprogramminglogic.chapter23.v1;

/*
 *@create by jiankang
 *@date 2020/5/19 time 20:34
 */


import java.lang.reflect.*;

public class SimpleJDKDynamicProxyDemo {

    static interface IService {
        public void sayHello();
    }

    static class RealService implements IService {

        @Override
        public void sayHello() {
            System.out.println("hello");
        }
    }

    static class SimpleInvocationHandler implements InvocationHandler {
        private Object realObj;

        public SimpleInvocationHandler(Object realObj) {
            this.realObj = realObj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("entering sayHello");
            Object invoke = method.invoke(realObj, args);
            System.out.println("leaving sayHello");
            return invoke;
        }

    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1 、
        RealService realService = new RealService();
        IService proxyService = (IService) Proxy.newProxyInstance(IService.class.getClassLoader(), new Class<?>[]{IService.class}, new SimpleInvocationHandler(realService));
        proxyService.sayHello();
        //2、
        Class<?> proxyClass = Proxy.getProxyClass(IService.class.getClassLoader(), IService.class);
        Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
        SimpleInvocationHandler handler = new SimpleInvocationHandler(realService);
        IService proxyService1 = (IService) constructor.newInstance(handler);
        proxyService1.sayHello();
    }
}
