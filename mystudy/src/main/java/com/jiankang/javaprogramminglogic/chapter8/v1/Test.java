package com.jiankang.javaprogramminglogic.chapter8.v1;

/*
 *@create by jiankang
 *@date 2020/3/24 time 19:02
 */

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //测试动态数组
        DynamicArray<Double> arr = new DynamicArray<>();
        Random random = new Random();
        int size = 1 + random.nextInt(100);
        for (int i = 0; i < size; i++) {
            arr.add(Math.random());
        }
        Double d = arr.get(random.nextInt(size));
        System.out.println(d);

        //泛型方法
        int result = DynamicUtils.indexOf(new String[]{"a", "b", "c"}, "a");
        System.out.println(result);

        DynamicArray<Pair<String, Integer>> pairDynamicArray = new DynamicArray<>();
        pairDynamicArray.add(new Pair<>("a", 1));


        Pair<Integer, Integer> integerIntegerPair = DynamicUtils.makePair(1, 2);
        Integer first = integerIntegerPair.first;
        System.out.println(first);


        NumberPair pair = new NumberPair(1, 11.11);
        double sum = pair.sum();
        System.out.println(sum);

        String max = DynamicUtils.max(new String[]{"a", "b", "c"});
        System.out.println(max);

        Class<? extends String> cls = "hello".getClass();
        System.out.println(cls);
    }


}
