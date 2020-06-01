package com.jiankang.javaprogramminglogic.chapter23.v1;

/*
 *@create by jiankang
 *@date 2020/5/19 time 20:06
 */

public class SimpleStaticProxyDemo {
    static interface IService{
        public void sayHello();
    }
    static class RealService implements IService{

        @Override
        public void sayHello() {
            System.out.println("hello");
        }
    }

    static class TraceProxy implements IService{
        private IService realService;

        public TraceProxy(IService realService) {
            this.realService = realService;
        }

        @Override
        public void sayHello() {
            System.out.println("entering sayHello");
            this.realService.sayHello();
            System.out.println("leaving sayHello");

        }
    }

    public static void main(String[] args) {
        RealService realService = new RealService();
        TraceProxy traceProxy = new TraceProxy(realService);
        traceProxy.sayHello();
    }
}
