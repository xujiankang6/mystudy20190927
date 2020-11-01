package com.jiankang.improvejava151suggests.chapter7.v10.v2;

/*
 *@create by jiankang
 *@date 2020/11/1 time 14:26
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public interface Subject {

    public void request();
}

class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("real subject execute");
    }
}

class SubjectHandler implements InvocationHandler{

    private Subject subject;

    public SubjectHandler(Subject subject) {
        this.subject = subject;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //预处理
        System.out.println("before");
         Object invoke = method.invoke(subject, args);
        System.out.println("after");
        return null;
    }
}

