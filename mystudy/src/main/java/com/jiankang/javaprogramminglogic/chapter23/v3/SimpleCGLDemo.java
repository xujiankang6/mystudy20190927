package com.jiankang.javaprogramminglogic.chapter23.v3;

/*
 *@create by jiankang
 *@date 2020/5/21 time 16:32
 */

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class SimpleCGLDemo {
    static class RealService {
        public void sayHello() {
            System.out.println("hello");
        }
    }

    static class SimpleInterceptor implements MethodInterceptor {

        @Override
        public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
            System.out.println("entering " + method.getName());
            Object o1 = methodProxy.invokeSuper(o, args);
            System.out.println("leaving " + method.getName());
            return o1;
        }

        private static <T> T getProxy(Class<T> cls) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(cls);
            enhancer.setCallback(new SimpleInterceptor());
            return (T) enhancer.create();
        }

        public static void main(String[] args) {
            RealService proxy = getProxy(RealService.class);
            proxy.sayHello();
        }
    }

}
