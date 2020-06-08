package com.jiankang.javacoretechnologythetenversion.chapter5.v9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;

/**
 * Test2
 *
 * @author jiankang.xu
 * @date 2020/6/7
 */
public class Test2 {


    public static void main(String[] args) {
        List list = new ArrayList<String>();
        list.add("2");
        list.add(2);
        list.add(null);
        list.add(3);
        System.out.println(Arrays.toString(list.toArray()));

        //删除集合里面为空的数据
        list.removeIf(Objects::isNull);

        System.out.println(Arrays.toString(list.toArray()));

        BiFunction<String, String, Integer> comp = (first, second) -> first.length() - second.length();


    }
}
