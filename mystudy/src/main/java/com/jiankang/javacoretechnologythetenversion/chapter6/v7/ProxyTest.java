package com.jiankang.javacoretechnologythetenversion.chapter6.v7;

/*
 *@create by jiankang
 *@date 2020/6/12 time 9:32
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

public class ProxyTest {

    public static void main(String[] args) {
        Object[] elements = new Object[100];
        for (int i = 0; i < elements.length; i++) {
            Integer value = i + 1;
            InvocationHandler handler = new TraceHandler(value);
            Object proxy = Proxy.newProxyInstance(null, new Class[]{Comparable.class}, handler);
            elements[i] = proxy;
        }

        Integer key = new Random().nextInt(elements.length) + 1;
        int result = Arrays.binarySearch(elements, key);
        if (result >= 0) System.out.println(elements[result]);
        System.out.println(Proxy.isProxyClass(elements[1].getClass()));
        System.out.println(Proxy.getProxyClass(null, Comparable.class));
    }
}
