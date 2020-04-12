package com.jiankang.javaprogramminglogic.chapter8.v1;

/*
 *@create by jiankang
 *@date 2020/4/3 time 13:13
 */

public class Test2 {
    public static void main(String[] args) {
        DynamicArray<Number> numbers = new DynamicArray<>();
        DynamicArray<Integer> ints = new DynamicArray<>();
        ints.add(100);
        ints.add(23);
        numbers.addAll(ints);
    }
}
