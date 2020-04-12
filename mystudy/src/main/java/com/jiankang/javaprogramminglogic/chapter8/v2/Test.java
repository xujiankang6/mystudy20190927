package com.jiankang.javaprogramminglogic.chapter8.v2;

/*
 *@create by jiankang
 *@date 2020/4/4 time 15:00
 */

import com.jiankang.javaprogramminglogic.chapter8.v1.DynamicArray;

public class Test {
    public static void main(String[] args) {
        DynamicArray<Child> childs = new DynamicArray<Child>();
        childs.add(new Child(11));
        childs.add(new Child(20));
        //该max方法，返回值实现了<? super T>
        Child max = DynamicArray.max(childs);
        System.out.println(max);
    }
}
