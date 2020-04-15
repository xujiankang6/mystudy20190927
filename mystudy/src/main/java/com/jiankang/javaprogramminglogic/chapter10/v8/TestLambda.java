package com.jiankang.javaprogramminglogic.chapter10.v8;

/*
 *@create by jiankang
 *@date 2020/4/15 time 10:39
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class TestLambda {

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("a", "1", "1"));
        apples.add(new Apple("b", "2", "3"));
        apples.add(new Apple("c", "3", "1"));
        apples.add(new Apple("d", "1", "4"));
        apples.add(new Apple("e", "2", "1"));


        Map<String, String> collect = apples.stream().collect(Collectors.toMap(Apple::getId, Apple::getRank,
                BinaryOperator.maxBy(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o2.compareTo(o1);
                    }
                })));
        System.out.println(collect);

    }
}
