package com.jiankang.javaprogramminglogic.chapter8.v1;

/*
 *@create by jiankang
 *@date 2020/4/3 time 14:07
 */

public class Test4 {
    public static void main(String[] args) {
        DynamicArray<Integer> ints = new DynamicArray<>();
        DynamicArray<Number> numbers =new DynamicArray<>();
        ints.add(1);
        ints.add(1);
        ints.add(1);
        ints.copyTo(numbers);
    }
}
