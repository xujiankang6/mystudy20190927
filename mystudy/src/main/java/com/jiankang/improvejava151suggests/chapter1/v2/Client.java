package com.jiankang.improvejava151suggests.chapter1.v2;

/*
 *@create by jiankang
 *@date 2020/6/1 time 13:09
 */

import java.util.Date;

public class Client {
    public static void main(String[] args) {

        System.out.println("String" instanceof Object);
        System.out.println(new String() instanceof String);
        System.out.println(new Object() instanceof String);
//        System.out.println('A' instanceof Character);
        System.out.println(null instanceof String);
        System.out.println((String) null instanceof String);
//        System.out.println(new Date() instanceof String);
        System.out.println(new GenericClass<String >().isDateInstance(""));


    }

    static class GenericClass<T> {
        public boolean isDateInstance(T t) {
            return t instanceof Date;
        }
    }
}
