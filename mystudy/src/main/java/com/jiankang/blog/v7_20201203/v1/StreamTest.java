package com.jiankang.blog.v7_20201203.v1;

/*
 *@create by jiankang
 *@date 2020/12/3 @time 17:13
 */


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");
        final Optional<String> max = list.stream().max(Comparator.comparing(String::length));
        System.out.println(max.get());

        final List<Integer> lists = Arrays.asList(7, 6, 9, 4, 11, 6);
        Optional<Integer> max2 = lists.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(max2);



    }
}
