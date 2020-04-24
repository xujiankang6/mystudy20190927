package com.jiankang.javaprogramminglogic.chapter4.v3;

/*
 *@create by jiankang
 *@date 2020/4/24 time 11:12
 */

public class Base {
    private static final int MAX_NUM = 1000;
    private int[] arr = new int[MAX_NUM];
    private int count;

    public void add(int number) {
        if (count < MAX_NUM) {
            arr[count++] = number;
        }
    }

    public void addAll(int[] numbers) {
        for (int num : numbers) {
            add(num);
        }
    }

    public void clear() {
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        count = 0;
    }
}
