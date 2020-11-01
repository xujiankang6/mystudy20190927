package com.jiankang.javacoretechnologythetenversion.chapter5.v6;

/*
 *@create by jiankang
 *@date 2020/6/2 time 20:19
 */

import com.jiankang.javacoretechnologythetenversion.chapter4.v2.Employee;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee harrt = new Employee("11");
        Class<? extends Employee> cl = harrt.getClass();
        Field f = cl.getDeclaredField("name");
        f.setAccessible(true);
        Object o = f.get(harrt);
        f.set(harrt,"aa");
        System.out.println(f.get(harrt));
    }
}
