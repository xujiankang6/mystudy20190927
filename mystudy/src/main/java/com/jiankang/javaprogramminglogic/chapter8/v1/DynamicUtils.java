package com.jiankang.javaprogramminglogic.chapter8.v1;

/*
 *@create by jiankang
 *@date 2020/3/24 time 19:15
 */

public class DynamicUtils {


    public static <T> int indexOf(T[] arr, T elm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(elm)) {
                return i;
            }
        }
        return -1;
    }


    public static <U, V> Pair<U, V> makePair(U first, V second) {
        Pair<U, V> pair = new Pair<>(first, second);
        return pair;
    }

    //T 表示一种数据类型，必须实现Comparable接口，且必须可以与相同类型的元素进行比较
    public static <T extends Comparable<T>> T max(T[] arr) {
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0)
                max = arr[i];
        }
        return max;
    }
}
