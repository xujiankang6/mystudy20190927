package com.jiankang.javaprogramminglogic.chapter8.v1;

/*
 *@create by jiankang
 *@date 2020/4/3 time 13:29
 */

public class Test3 {
    public static void main(String[] args) {
        DynamicArray<Integer> ints = new DynamicArray<>();
        DynamicArray<? extends Number> numbers = ints;
        Integer a = 22;
        DynamicArray<? super Number> number2 = new DynamicArray<>();
        //1、报错，原因是类型安全无知，虽然是写入Number的子类型，但是不知道具体是哪个子类型
//        numbers.add(a);
        //2、解决方案为，使用超类型通配符,如下：
        number2.add(a);
    }
}
