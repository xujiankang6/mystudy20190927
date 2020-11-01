package com.jiankang.improvejava151suggests.chapter7.v8;

/*
 *@create by jiankang
 *@date 2020/11/1 time 13:26
 */

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //类的属性class与所引用对象与实例对象的getClass返回值相同
        System.out.println(String.class.equals(new String().getClass()));
        System.out.println("ABC".getClass().equals(String.class));
        //class实例对象不区分泛型
        System.out.println(ArrayList.class.equals(new ArrayList<String>().getClass()));
    }
}
