package com.jiankang.javaprogramminglogic.chapter10.v7;

/*
 *@create by jiankang
 *@date 2020/4/12 time 15:15
 */

import com.jiankang.javaprogramminglogic.chapter5.Size;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class EnumTest {
    public static void main(String[] args) {
        List<Clothes> clothes = new ArrayList<>();
        clothes.add(new Clothes("1", Size.LARGE));
        clothes.add(new Clothes("1", Size.LARGE));
        clothes.add(new Clothes("1", Size.LARGE));
        clothes.add(new Clothes("1", Size.LARGE));
        clothes.add(new Clothes("1", Size.LARGE));
        Map<Size, Integer> sizeIntegerMap = countBySize(clothes);
        System.out.println(sizeIntegerMap);

    }


    public static Map<Size, Integer> countBySize(List<Clothes> clothes) {
        EnumMap<Size, Integer> map = new EnumMap<>(Size.class);
        for (Clothes c : clothes) {
            Size size = c.getSize();
            Integer count = map.get(size);
            if (count != null) {
                map.put(size, count + 1);
            } else {
                map.put(size, 1);
            }
        }
        return map;
    }
}
