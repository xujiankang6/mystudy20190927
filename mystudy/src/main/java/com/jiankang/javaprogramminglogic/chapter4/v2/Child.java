package com.jiankang.javaprogramminglogic.chapter4.v2;

/*
 *@create by jiankang
 *@date 2020/4/24 time 11:15
 */

public class Child extends Base {
    private long sum;

    @Override
    public void add(int number) {
        super.add(number);
        sum += number;
    }

    @Override
    public void addAll(int[] numbers) {
        super.addAll(numbers);
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
    }

    public long getSum() {
        return sum;
    }

}
