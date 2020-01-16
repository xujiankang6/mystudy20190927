package com.jiankang.blog.v1_20200115.v7;

/*
 *@create by jiankang
 *@date 2020/1/16 time 16:17
 */

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

public class EnumDemo7 {
    public static void main(String[] args) {
        ArrayList<Clothes> list = new ArrayList<>();
        list.add(new Clothes("C001", Color.BLUE));
        list.add(new Clothes("C002", Color.YELLOW));
        list.add(new Clothes("C003", Color.RED));
        list.add(new Clothes("C004", Color.GREEN));
        list.add(new Clothes("C005", Color.BLUE));
        list.add(new Clothes("C006", Color.BLUE));
        list.add(new Clothes("C007", Color.RED));
        list.add(new Clothes("C008", Color.YELLOW));
        list.add(new Clothes("C009", Color.YELLOW));
        list.add(new Clothes("C010", Color.GREEN));

        //使用枚举Map
        Map<Color, Object> colorObjectEnumMap = new EnumMap<>(Color.class);
        list.forEach(
                it -> {
                    Color color = it.getColor();
                    Integer count = (Integer) colorObjectEnumMap.get(color);
                    if (count != null) {
                        colorObjectEnumMap.put(color, count + 1);
                    } else {
                        colorObjectEnumMap.put(color, 1);
                    }
                }
        );
        System.out.println(colorObjectEnumMap.toString());

    }

    enum Color {
        GREEN, RED, YELLOW, BLUE
    }
}
