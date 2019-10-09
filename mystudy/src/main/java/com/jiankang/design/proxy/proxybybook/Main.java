package com.jiankang.design.proxy.proxybybook;

import javassist.CannotCompileException;
import javassist.NotFoundException;

public class Main {

    public static final int CIRCIE = 300000000;

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NotFoundException, CannotCompileException {
        IDBQuery d1 = null;
        //测试jdk东动态代理
        long begin = System.currentTimeMillis();
        d1 = JdkQueryHandler.createJdkProxy();//测试jdk东动态代理
        System.out.println("createJdkProxy class:" + (System.currentTimeMillis() - begin));
        System.out.println("JdkProxy class:" + d1.getClass().getName());
        begin = System.currentTimeMillis();
        for (int i = 0; i < CIRCIE; i++) {
            d1.request();
        }
        System.out.println("CallJdkProxy:" + (System.currentTimeMillis() - begin));

        System.out.println("--------------------------------------------");
        //测试Cglib东动态代理
//        IDBQuery d2 = null;
        begin = System.currentTimeMillis();
        d1 = CglibDbQueryInterceptor.createCglibProxy();//测试Cglib东动态代理
        System.out.println("createCglibProxy class:" + (System.currentTimeMillis() - begin));
        System.out.println("CglibProxy class:" + d1.getClass().getName());
        begin = System.currentTimeMillis();
        for (int i = 0; i < CIRCIE; i++) {
            d1.request();
        }
        System.out.println("CallCglibProxy:" + (System.currentTimeMillis() - begin));

        System.out.println("---------------------------------------");
        //测试Javassisty东动态代理  DynProx
        IDBQuery d3 = null;
        begin = System.currentTimeMillis();
        d3 = JavassistDynDbQueryHandler.createJavassistDynProxy();
        System.out.println("createJavassistDynProxy class:" + (System.currentTimeMillis() - begin));
        System.out.println("JavassistDynProxy class:" + d3.getClass().getName());
        begin = System.currentTimeMillis();
        for (int i = 0; i < CIRCIE; i++) {
            d3.request();
        }
        System.out.println("CallJavassistDynProxy:" + (System.currentTimeMillis() - begin));

        //测试Javassisty东动态代理  JavassistBytecodeDynamicProxy
        //测试失败,需要java8以下版本
        /*IDBQuery d4 = null;
        begin = System.currentTimeMillis();
        d4= JavassistDynDbQueryHandler.createJavassistBytecodeDynamicProxy();
        System.out.println("JavassistBytecodeDynamicProxy class:" + (System.currentTimeMillis() - begin));
        System.out.println("JavassistBytecodeDynamicProxy class:" + d4.getClass().getName());
        begin = System.currentTimeMillis();
        for (int i = 0; i < CIRCIE; i++) {
            d4.request();
        }
        System.out.println("CallJavassistBytecodeDynamicProxy:" + (System.currentTimeMillis() - begin));*/
       /* IDBQuery q=new DBQueryProxy();
        q.request();*/
    }
}
