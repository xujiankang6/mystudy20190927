package com.jiankang.javacoretechnologythetenversion.chapter5.v7;

/*
 *@create by jiankang
 *@date 2020/6/5 time 11:24
 */

import com.jiankang.javacoretechnologythetenversion.chapter4.v2.Employee;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method m1 = Employee.class.getMethod("getName");
        Employee e = new Employee("aa");
        Object invoke = m1.invoke(e);
        System.out.println(invoke);

    }
}
