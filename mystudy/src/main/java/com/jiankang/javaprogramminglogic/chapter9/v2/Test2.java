package com.jiankang.javaprogramminglogic.chapter9.v2;

/*
 *@create by jiankang
 *@date 2020/3/26 time 16:12
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        //这种方法生成的list集合，不是真正的arraytlist，而是Arrays的一个内部类，该内部类继承
//        AbstractList，但是该内部类没有实现add（），remove（）等方法，所以调用该方法，只是
//        调用了Collection的接口，改接口没有实现add()等方法。
//        故报错Exception in thread "main" java.lang.UnsupportedOperationException
        Integer[] a = {1, 2, 3};
        List<Integer> integers = Arrays.asList(a);

        //解决方案
        ArrayList<Integer> integers1 = new ArrayList<>(integers);
        integers1.add(1);
    }
}
