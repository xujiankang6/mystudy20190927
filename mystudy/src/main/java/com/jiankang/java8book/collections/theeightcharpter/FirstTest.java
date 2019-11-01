package com.jiankang.java8book.collections.theeightcharpter;

/*
 *@create by jiankang
 *@date 2019/10/31 time 13:41
 */

import java.util.stream.Stream;

public class FirstTest {

    public static void main(String[] args) {
        Long reduce = Stream.iterate(1L, i -> i + 1).limit(1000).parallel().reduce(0L, Long::sum);

    }
}
