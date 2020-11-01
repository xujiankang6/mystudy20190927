package com.jiankang.improvejava151suggests.chapter7.v5;

/*
 *@create by jiankang
 *@date 2020/10/30 time 17:56
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;

public class DecorateAnimal implements Animal {

    private Animal animal;

    private Class<? extends Feature> clz;

    public DecorateAnimal(Animal animal, Class<? extends Feature> clz) {
        this.animal = animal;
        this.clz = clz;
    }

    @Override
    public void doStuff() {
        InvocationHandler handler = new InvocationHandler() {

            //具体包装行为
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object obj = null;
                if (Modifier.isPublic(method.getModifiers())) {
                    obj = method.invoke(clz.newInstance(), args);
                }
                return obj;
            }
        };
        ClassLoader cl = getClass().getClassLoader();
        Feature proxy = (Feature) Proxy.newProxyInstance(cl, clz.getInterfaces(), handler);
        proxy.load();
        animal.doStuff();
    }
}
