package com.jiankang.design.proxy.proxybybook;


import javassist.*;
import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;
import java.lang.reflect.Method;

public class JavassistDynDbQueryHandler implements MethodHandler {

    IDBQuery real = null;


    @Override
    public Object invoke(Object o, Method method, Method method1, Object[] objects) throws Throwable {
        if (real == null) {
            real = new DBQuery();

        }
        return real.request();
    }


    public static IDBQuery createJavassistDynProxy() throws IllegalAccessException, InstantiationException {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setInterfaces(new Class[]{IDBQuery.class});//指定接口
        Class proxyClass = proxyFactory.createClass();
        IDBQuery javassistProxy = (IDBQuery) proxyClass.newInstance();//设置Handler处理器
        ((ProxyObject) javassistProxy).setHandler(new JavassistDynDbQueryHandler());
        return javassistProxy;
    }

    public static IDBQuery createJavassistBytecodeDynamicProxy() throws NotFoundException, CannotCompileException, IllegalAccessException, InstantiationException {
        ClassPool classPool = new ClassPool();
        CtClass ctClass = classPool.makeClass(IDBQuery.class.getName() + "JavaassistBytecodeDynamicProxy");
        //需要实现的接口
        ctClass.addInterface(classPool.get(IDBQuery.class.getName()));
        //添加构造函数
        ctClass.addConstructor(CtNewConstructor.defaultConstructor(ctClass));
        //添加类的字段信息，使用动态Java代码
        ctClass.addField(CtField.make("public " + IDBQuery.class.getName() + " real;", ctClass));
        String dbqueryname = DBQuery.class.getName();
        //添加方法，这里使用动态Java代码指定内部逻辑
        ctClass.addMethod(CtNewMethod.make("if (real == null) {\n" +
                "            real = new DBQuery();\n" +
                "        }\n" +
                "        return real.request();", ctClass));
        //基于以上信息，生成动态类
        Class pc = ctClass.toClass();
        //生成动态的实例
        IDBQuery bytecodeProxy = (IDBQuery) pc.newInstance();
        return bytecodeProxy;
    }
}
