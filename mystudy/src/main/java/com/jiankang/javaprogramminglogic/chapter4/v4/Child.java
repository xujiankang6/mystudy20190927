package com.jiankang.javaprogramminglogic.chapter4.v4;

/*
 *@create by jiankang
 *@date 2020/4/24 time 11:15
 */

public class Child {
    private Base base;
    private long sum;

    public void add(int number) {
        base.add(number);
        sum += number;
    }

    public void addAll(int[] numbers) {
        base.addAll(numbers);
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
    }

    public long getSum() {
        return sum;
    }


}
