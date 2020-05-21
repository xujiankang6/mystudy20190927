package com.jiankang.javaprogramminglogic.chapter23.v4;

import java.lang.reflect.Method;
import java.util.Arrays;

/*
 *@create by jiankang
 *@date 2020/5/21 time 17:07
 */
@Aspect({ServiceA.class, ServiceB.class})
public class ServiceLogAspect {
    public static void before(Object object, Method method, Object[] args) {
        System.out.println("entering " + method.getDeclaringClass().getSimpleName() + "::" + method.getName()
                + " , args:" + Arrays.toString(args));
    }

    public static void after(Object object, Method method, Object[] args, Object result) {
        System.out.println("leaving " + method.getDeclaringClass().getSimpleName() + "::" +
                method.getName() + " , result:" + result);
    }
}
