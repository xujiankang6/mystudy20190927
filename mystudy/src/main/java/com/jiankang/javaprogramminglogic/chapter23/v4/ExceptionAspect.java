package com.jiankang.javaprogramminglogic.chapter23.v4;



import java.lang.reflect.Method;
import java.util.Arrays;

/*
 *@create by jiankang
 *@date 2020/5/21 time 17:08
 */
@Aspect({ServiceB.class})
public class ExceptionAspect {
    public static void exception(Object object, Method method, Object[] args, Throwable e) {
        System.err.println("exception when calling:  " + method.getName() + "," + Arrays.toString(args));
    }

}
